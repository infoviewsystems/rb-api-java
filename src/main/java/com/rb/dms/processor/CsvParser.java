package com.rb.dms.processor;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.rb.dms.api.APICaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CsvParser {

	private static final String NP = "NP";
	private static final String INTEGER = "integer";
	private static final String NUMBER = "number";
	private static final String DATE = "date";
	private static final String DATETIME = "datetime";

	public static final String API_DATE_FORMAT = "yyyy-MM-dd";
	public static final String API_DATETIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

	@Value("${app.type}")
	String appType;

	@Value("${output.directory}")
	String outputDirectory;

	@Value("${file.in.delimiter}") 
	char fileInDelimiter;

	@Value("${file.in.header}")
	boolean fileInHeader;

	@Value("${file.out.delimiter}")
	char fileOutDelimiter;

	@Value("${file.out.extension}")
	String fileOutExtension;

	@Value("${file.out.header}")
	boolean fileOutHeader;

	@Value("${file.date.format}")
	String fileDateFormat;

	@Value("${file.datetime.format}")
	String fileDatetimeFormat;

	@Value("${file.out.timestamp.format}")
	String fileOutTimestampFormat;

	@Value("#{${dbCode.dbName.map}}")
	Map<String, String> dbCodeDbNameMap;

	@Value("${dbCode.field.name:}")
	String dbCodeFieldName;

	@Autowired
	APICaller apiCaller;

	public boolean readCSVFileAndPost(final File csvFile, final String schemaFileName, final String groupByFieldName, final String endpoint) {
		System.out.println("File " + csvFile.getName() + " is processed.");

		try {
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> interfaceSchema = mapper.readValue(new File(schemaFileName), new TypeReference<Map<String, Object>>(){});

			Map<String, FieldDescription> interfaceLeveledSchema = new HashMap<>();
			CsvSchema.Builder schemaBuilder = CsvSchema.builder();
			buildSchema(schemaBuilder, interfaceSchema, interfaceLeveledSchema, 1);
			schemaBuilder.setColumnSeparator(fileInDelimiter);
			schemaBuilder.setSkipFirstDataRow(fileInHeader);
			CsvSchema schema = schemaBuilder.build();

			ObjectReader objectReader = new CsvMapper().readerFor(Map.class).with(schema);
			MappingIterator<Map<String, Object>> iter = objectReader.readValues(csvFile);
			final List<Map<String, Object>> flatItemList = iter.readAll();

			flatItemList.forEach(flatItem -> {
				interfaceLeveledSchema.forEach((field, fieldDescription) -> {
					if (INTEGER.equals(fieldDescription.getType())) {
						flatItem.replace(field, convertToInt(flatItem.get(field)));
					} else if (NUMBER.equals(fieldDescription.getType())) {
						flatItem.replace(field, convertToDouble(flatItem.get(field)));
					} else if (DATE.equals(fieldDescription.getType())) {
						flatItem.replace(field, convertToDate(flatItem.get(field), fileDateFormat, API_DATE_FORMAT));
					} else if (DATETIME.equals(fieldDescription.getType())) {
						flatItem.replace(field, convertToDatetime(flatItem.get(field), fileDatetimeFormat, API_DATETIME_FORMAT));
					}
				});
			});

			List<Map<String, Object>> itemList;

			if (groupByFieldName != null) {
				itemList = flatItemList.stream().collect(Collectors.groupingBy(map -> map.get(groupByFieldName).toString())).values().stream().map
					(groupedFlatItemList -> {
						Map<String, Object> item = new HashMap();
						if (!groupedFlatItemList.isEmpty()) {
							Map<String, Object> flatItem = groupedFlatItemList.get(0);
							interfaceLeveledSchema.forEach((field, fieldDescription) -> {
								if (fieldDescription.getLevel() == 1) {
									item.put(field, flatItem.get(field));
								}
							});

							List<Map<String, Object>> lineItemList = new ArrayList();
							groupedFlatItemList.forEach(flatPersonItem -> {
								Map<String, Object> lineItem = new HashMap();
								Map<String, Object> promo = new HashMap();
								interfaceLeveledSchema.forEach((field, fieldDescription) -> {
									if (fieldDescription.getLevel() == 2) {
										lineItem.put(field, flatPersonItem.get(field));
									} else if (fieldDescription.getLevel() == 3) {
										promo.put(field, flatPersonItem.get(field));
									}
								});
								if (!promo.isEmpty()) {
									lineItem.put("promo", promo);
								}
								lineItemList.add(lineItem);
							});
							item.put("lineItems", lineItemList);
						}
						return item;
					}).collect(Collectors.toList());


			} else {
				itemList = flatItemList;
			}

			if (NP.equals(appType)) {
				dbCodeDbNameMap.forEach((dbCode, dbName) -> {
					final List filteredList = itemList.stream().filter(map -> dbCode.equals(map.get(dbCodeFieldName)))
							.collect(Collectors.toList());
					if (filteredList.isEmpty()) {
						System.out.println("No records for distributor " + dbCode);
					} else {
						apiCaller.post(filteredList, dbName, endpoint);
						System.out.println("Filtering completed successfully and posted to distributor Rest API :: " +
								"distributor Code - " + dbCode);
					}
				});
			} else {
				apiCaller.post(itemList, endpoint);
			}

			System.out.println("Records have been processed.");
		} catch (IOException e) {
			System.err.println("Error has been occurred. See details: " + e.getMessage());
		}

		return true;
	}

	public void writeCSVFile(String schemaFileName, String filePrefix, String fileHeader, String endpoint) {
		List<Map<String, Object>> itemList = apiCaller.get(endpoint);

		if (!itemList.isEmpty()) {
			List<Map<String, Object>> flatItemList = new ArrayList<>();

			itemList.forEach(item -> {
				flattenMap(item, flatItemList);
			});

			try {
				ObjectMapper mapper = new ObjectMapper();
				Map<String, Object> interfaceSchema = mapper.readValue(new File(schemaFileName), new TypeReference<Map<String, Object>>() {});

				Map<String, FieldDescription> interfaceLeveledSchema = new HashMap<>();
				CsvSchema.Builder schemaBuilder = CsvSchema.builder();
				buildSchema(schemaBuilder, interfaceSchema, interfaceLeveledSchema, 1);
				schemaBuilder.disableQuoteChar();
				schemaBuilder.setColumnSeparator(fileOutDelimiter);
				CsvSchema schema = schemaBuilder.build();

				flatItemList.forEach(flatItem -> {
					interfaceLeveledSchema.forEach((field, fieldDescription) -> {
						if (DATE.equals(fieldDescription.getType())) {
							flatItem.replace(field, convertToDate(flatItem.get(field), API_DATE_FORMAT, fileDateFormat));
						} else if (DATETIME.equals(fieldDescription.getType())) {
							flatItem.replace(field, convertToDatetime(flatItem.get(field), API_DATETIME_FORMAT, fileDatetimeFormat));
						}
					});
				});

				ObjectWriter objectWriter = new CsvMapper().configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true).writerFor(Map.class).with(schema);
				String pathName = outputDirectory + File.separator + filePrefix + LocalDateTime.now().format(DateTimeFormatter.ofPattern(fileOutTimestampFormat)) + fileOutExtension;
				File tempFile = new File(pathName);
				Writer writer = new FileWriter(tempFile, true);
				if (fileHeader != null) {
					writer.append(fileHeader + "\n");
				}

				objectWriter.writeValues(writer).writeAll(flatItemList);
				writer.flush();
				writer.close();

				System.out.println("File " + tempFile.getName() + " has been written.");
			} catch (IOException e) {
				System.err.println("Error has been occurred. See details: " + e.getMessage());
			}
		}
	}

	private void flattenMap(Map<String, Object> item, List<Map<String, Object>> flatItemList) {
		List lineItems = (List) item.get("lineItems");

		if (lineItems != null) {
			item.remove("lineItems");

			lineItems.forEach(lineItem -> {
				Map<String, Object> flattenedLineItem = new HashMap(item);
				flattenLineItem((Map) lineItem, flattenedLineItem);
				flatItemList.add(flattenedLineItem);
			});
		} else {
			flatItemList.add(item);
		}
	}

	private void flattenLineItem(Map<String, Object> item, Map<String, Object> flatItem) {
		item.forEach( (field, type) -> {
			if (type instanceof Map) {
				flattenLineItem((Map) type, flatItem);
			} else {
				flatItem.put(field, type);
			}
		});
	}

	private Integer convertToInt(Object fieldValue) {
		try {
			return Double.valueOf(Double.parseDouble(fieldValue.toString())).intValue();
		} catch (NumberFormatException nfe) {
			return 0;
		}
	}

	private Double convertToDouble(Object fieldValue) {
		try {
			return Double.parseDouble(fieldValue.toString());
		} catch (NumberFormatException nfe) {
			return 0.0;
		}
	}

	private String convertToDate(Object fieldValue, String inputFormat, String outputFormat) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(inputFormat);
		LocalDate date = LocalDate.parse(fieldValue.toString(), formatter);
		return date.format(DateTimeFormatter.ofPattern(outputFormat));
	}

	private String convertToDatetime(Object fieldValue, String inputFormat, String outputFormat) {
		LocalDateTime dateTime = LocalDateTime.parse(fieldValue.toString(), DateTimeFormatter.ofPattern(inputFormat));
		return dateTime.format(DateTimeFormatter.ofPattern(outputFormat));
	}

	private void buildSchema(CsvSchema.Builder schemaBuilder, Map<String, Object> orderSchema, Map<String, FieldDescription> orderLeveledSchema, int level) {
		orderSchema.forEach( (field, type) -> {
			if (type instanceof Map) {
				buildSchema(schemaBuilder, (Map) type, orderLeveledSchema, level + 1);
			} else {
				schemaBuilder.addColumn(field);
				FieldDescription fieldDescription = new FieldDescription(type.toString(), level);
				orderLeveledSchema.put(field, fieldDescription);
			}
		});
	}

	private class FieldDescription {
		private String type;
		private int level;

		public FieldDescription(String type, int level) {
			this.type = type;
			this.level = level;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}
	}

}
