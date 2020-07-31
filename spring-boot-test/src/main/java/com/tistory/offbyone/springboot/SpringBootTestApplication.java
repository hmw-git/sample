package com.tistory.offbyone.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootTestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}
	
	@Override 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) { 
		return builder.sources(SpringBootTestApplication.class); 
	}


}
