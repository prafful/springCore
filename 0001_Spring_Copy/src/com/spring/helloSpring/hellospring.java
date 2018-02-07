package com.spring.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hellospring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Technology t = (Technology)context.getBean("technologyBean");
		System.out.println(t.getName1());
		
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
