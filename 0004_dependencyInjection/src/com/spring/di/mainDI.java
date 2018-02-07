package com.spring.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mainDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml");
		Friend friend = (Friend) ctx.getBean("friendBean");
		System.out.println(friend.getName() + " is from " + friend.myLocation());
		
		

	}

}
