package com.call;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApIcallingApplication {
	private static Logger log = LoggerFactory.getLogger(ApIcallingApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ApIcallingApplication.class, args);
		
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}
	

}
