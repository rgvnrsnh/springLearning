package com.raghav.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("com/raghav/autowiring/annotations/autoConfig.xml");
	  
	  Employee employee = context.getBean("emp1" , Employee.class);
	  System.out.println(employee);
	}

}
