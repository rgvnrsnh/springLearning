package com.raghav.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IskiMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/raghav/standaloneCollection/CollectionConfig.xml");
		
		Person p1 = context.getBean("person1" , Person.class);
		System.out.println(p1.getFriend());
		System.out.println(p1.getCourses());
		System.out.println(p1.getProps());
		System.out.println(p1.getVal());
	}
}
