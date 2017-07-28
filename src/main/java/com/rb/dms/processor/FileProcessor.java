package com.rb.dms.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.File;
import java.util.List;
import java.util.Map;

public class FileProcessor {

    private static final String NP = "NP";

    @Value("${app.type}")
    String appType;

    @Value("#{${interface.file.prefix.map}}")
    Map<String, String> interfaceFilePrefixMap;

    @Value("#{${interface.file.header.map}}")
    Map<String, String> interfaceFileHeaderMap;

    @Value("#{${interface.groupBy.map}}")
    Map<String, String> interfaceGroupByMap;

    @Value("#{${interface.endpoint.map}}")
    Map<String, String> interfaceEndpointMap;

    @Value("#{'${interface.get.list}'.split(',')}")
    List<String> interfaceGetList;

    @Autowired
    CsvParser csvParser;

    @Value("${interface.config.directory}")
   	String configDir;

    public void processInputFiles(File file) {
        interfaceFilePrefixMap.forEach((interfaceName, filePrefix) -> {
            if (file.getName().startsWith(filePrefix)) {
                String schemaFileName = configDir + File.separator + interfaceName + "Schema.json";
                csvParser.readCSVFileAndPost(file, schemaFileName, interfaceGroupByMap.get(interfaceName), interfaceEndpointMap.get(interfaceName));
                file.delete();
            }
        });
    }

    @Scheduled(fixedDelayString="${listener.fixedDelay}")
    public void processOutputFiles() {
        interfaceGetList.forEach((interfaceName) -> {
            String schemaFileName = configDir + File.separator + interfaceName + "Schema.json";;
            if (NP.equals(appType)) {
                csvParser.writeCSVFile(schemaFileName, interfaceFilePrefixMap.get(interfaceName),
                        interfaceFileHeaderMap.get(interfaceName), interfaceEndpointMap.get(interfaceName));
            } else {
                csvParser.writeCSVFile(schemaFileName, interfaceFilePrefixMap.get(interfaceName), null,
                        interfaceEndpointMap.get(interfaceName));
            }
        });
    }
}
