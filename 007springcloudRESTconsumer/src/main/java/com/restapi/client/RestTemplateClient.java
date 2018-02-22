package com.restapi.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateClient {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	public void getData() {
		
		List<ServiceInstance> instances = discoveryClient.getInstances("friend-rest-provider");
		ServiceInstance serviceInstance = instances.get(0);
		///////
		String baseURL = serviceInstance.getUri().toString();
		
		String newBaseURL = baseURL + "/hello";
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		response = restTemplate.exchange(
				newBaseURL, 
				HttpMethod.GET, getHeaders(), String.class);
		
		System.out.println(response.getBody());
		
	}

	private HttpEntity getHeaders() {
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.TEXT_PLAIN_VALUE);
		return new HttpEntity<>(headers);
	}
	
}
