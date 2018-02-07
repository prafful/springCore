package com.spring.beanpostprocessor;

public class Location {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void initializeMethod(){
		System.out.println("Inside init-method");
	}

}
