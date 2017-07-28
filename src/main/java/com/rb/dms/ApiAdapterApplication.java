package com.rb.dms;

import com.rb.dms.processor.FileProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.filters.AcceptOnceFileListFilter;
import org.springframework.integration.file.filters.CompositeFileListFilter;
import org.springframework.integration.file.filters.SimplePatternFileListFilter;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
public class ApiAdapterApplication {

	@Value("${input.directory}")
	String inputDirectory;

	@Value("${file.in.pattern}")
	String fileInPattern;

    public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(ApiAdapterApplication.class, args);
	}

	@Bean
	public IntegrationFlow processFileFlow() {
		return IntegrationFlows
				.from("fileInputChannel")
				.handle("fileProcessor", "processInputFiles").get();
	}

    @Bean
    public MessageChannel fileInputChannel() {
        return new DirectChannel();
    }

	@Bean
	@InboundChannelAdapter(value = "fileInputChannel", poller = @Poller(fixedDelay = "${poller.fixedDelay}"))
	public FileReadingMessageSource fileReadingMessageSource() {
		CompositeFileListFilter<File> filters = new CompositeFileListFilter<>();
		filters.addFilter(new SimplePatternFileListFilter(fileInPattern));
		filters.addFilter(new AcceptOnceFileListFilter());

		FileReadingMessageSource source = new FileReadingMessageSource();
		source.setAutoCreateDirectory(true);
		source.setDirectory(new File(inputDirectory));
		source.setFilter(filters);

		return source;
	}

	@Bean
	public FileProcessor fileProcessor() {
		return new FileProcessor();
	}

}
