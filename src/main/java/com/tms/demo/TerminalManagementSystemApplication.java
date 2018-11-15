package com.tms.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TerminalManagementSystemApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TerminalManagementSystemApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(TerminalManagementSystemApplication.class, args);
	}
}
