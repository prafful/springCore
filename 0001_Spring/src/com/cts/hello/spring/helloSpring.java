package com.cts.hello.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class helloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Setting.xml");
		Friend friend = (Friend)context.getBean("friendBean");
		System.out.println(friend.getName());
		
	}

}
