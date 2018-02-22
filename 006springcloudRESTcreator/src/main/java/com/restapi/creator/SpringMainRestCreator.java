package com.restapi.creator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringMainRestCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringMainRestCreator.class, args);
	}

}
