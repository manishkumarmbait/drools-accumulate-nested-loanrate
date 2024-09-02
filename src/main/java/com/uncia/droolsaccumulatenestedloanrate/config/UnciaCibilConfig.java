package com.uncia.droolsaccumulatenestedloanrate.config;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

@Configuration
public class UnciaCibilConfig {

	private static final KieServices kieServices = KieServices.Factory.get();
	private static final String RULES_CUSTOMER_RULES_ACCUMULATE = "src/main/resources/rules/accumulate.drl";
	private static final String RULES_CUSTOMER_RULES_LOAN_RATE = "src/main/resources/rules/loan_rate.drl";

	@Bean
	public KieContainer kieContainer() throws IOException {
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		kieFileSystem.write(RULES_CUSTOMER_RULES_ACCUMULATE, getDrlFileContent("rules/accumulate.drl"));
		kieFileSystem.write(RULES_CUSTOMER_RULES_LOAN_RATE, getDrlFileContent("rules/loan_rate.drl"));
		KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
		kb.buildAll();
		KieModule kieModule = kb.getKieModule();
		KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
		return kieContainer;
	}

	private String getDrlFileContent(String fileName) throws IOException {
		Resource resource = new ClassPathResource(fileName);
		InputStream inputStream;
		inputStream = resource.getInputStream();

		byte[] bytes = FileCopyUtils.copyToByteArray(inputStream);
		String fileContent = new String(bytes, StandardCharsets.UTF_8);
		return fileContent;
	}
}
