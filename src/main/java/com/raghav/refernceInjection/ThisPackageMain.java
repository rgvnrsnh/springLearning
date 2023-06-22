package com.raghav.refernceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThisPackageMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/raghav/refernceInjection/refConfig.xml");
		ClassB obj1 =(ClassB) context.getBean("bref");
		
		System.out.println(obj1);
		obj1.fullName();
	}

}
