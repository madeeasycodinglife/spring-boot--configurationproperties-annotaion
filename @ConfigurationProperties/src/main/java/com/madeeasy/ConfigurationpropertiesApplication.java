package com.madeeasy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MailModuleProperties.class)// it is optional
public class ConfigurationpropertiesApplication implements CommandLineRunner {
	private MailModuleProperties mailModuleProperties;

	public ConfigurationpropertiesApplication(MailModuleProperties mailModuleProperties) {
		this.mailModuleProperties = mailModuleProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationpropertiesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(mailModuleProperties.getPort());
		System.out.println(mailModuleProperties.getFrom());
		System.out.println(mailModuleProperties.getHostName());
	}
}
