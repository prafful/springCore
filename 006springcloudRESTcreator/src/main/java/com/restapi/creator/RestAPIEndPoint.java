package com.restapi.creator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIEndPoint {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Spring Cloud & Eureka Done";
	}
}
