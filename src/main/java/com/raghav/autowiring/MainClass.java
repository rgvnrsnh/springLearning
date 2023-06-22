package com.raghav.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("com/raghav/autowiring/AutoConfig.xml");
	  
	  Employee employee = context.getBean("emp2" , Employee.class);
	  System.out.println(employee);
	}

}
