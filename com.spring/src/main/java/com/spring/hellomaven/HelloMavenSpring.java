package com.spring.hellomaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMavenSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Friend friend = (Friend)context.getBean("friendBean");
		String friendName = friend.getName();
		System.out.println(friendName);
	}

}
