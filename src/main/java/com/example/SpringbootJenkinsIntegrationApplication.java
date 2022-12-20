package com.example;



import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsIntegrationApplication {

	public static Logger logger =LoggerFactory.getLogger(SpringbootJenkinsIntegrationApplication.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application Started.....");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsIntegrationApplication.class, args);
		logger.info("Application Executed.....");
	}

}
