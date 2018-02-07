package com.spring.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostProcessorSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
		Friend friend = (Friend) ctx.getBean("friendBean");
		friend.setName("Manish");
		System.out.println(friend.getName());
		
		Location location = (Location) ctx.getBean("locationBean");
		location.setName("Chennai");
		System.out.println(location.getName());
	}

}
