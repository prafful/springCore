package com.spring.helloSpring;


public class Technology {

	private String name1;

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	public void firstMethod(){
		System.out.println("Init method called");
	}
	
	public void destroyMe(){
		System.out.println("Destroy Method Called");
	}
}
	