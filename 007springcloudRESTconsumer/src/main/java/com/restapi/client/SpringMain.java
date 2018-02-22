package com.restapi.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = SpringApplication.run(SpringMain.class, args);
		RestTemplateClient restTemplateClient = context.getBean(RestTemplateClient.class);
		
		restTemplateClient.getData();
			
	}
	
	@Bean
	public RestTemplateClient restTemplateClient() {
		return new RestTemplateClient();
	}
	

}
