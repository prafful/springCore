package com.spring.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class hellospring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Technology t1 = new Technology();
		t1.getName1();
		/*Technology t1 = (Technology)context.getBean("technologyBean");
		t1.setName1("Spring MVC");
		System.out.println(t1.getName1());
		*/
		Framework framework1 = (Framework)context.getBean("frameworkBean");
		framework1.setName("Spring");
		framework1.setType("JAVA");
		System.out.println(framework1.getName() + " " + framework1.getType());
		
		
		
		//((AbstractApplicationContext) context).registerShutdownHook();
	}

}
