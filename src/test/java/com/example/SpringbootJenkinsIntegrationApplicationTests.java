package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsIntegrationApplicationTests {
	public static Logger logger =LoggerFactory.getLogger(SpringbootJenkinsIntegrationApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test is Executing...");
		logger.info("Testing is Pipeline...")
		assertEquals(true, true);
	}

}
