package com.ttj.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ttj")
public class ConfigClientTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientTestApplication.class, args);
	}

}
