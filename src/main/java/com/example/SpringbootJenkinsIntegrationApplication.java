package com.example;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsIntegrationApplication {

	public static Logger logger =LoggerFactory.getLogger(SpringbootJenkinsIntegrationApplication.class);
	
	public void init() {
		logger.info("Application Started.....");
	}
	
	public static void main(String[] args) {
		logger.info("Application Executed.....");
		SpringApplication.run(SpringbootJenkinsIntegrationApplication.class, args);
	}

}
