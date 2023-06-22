package com.raghav.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThisPackageMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/raghav/constructorinjection/ciConfig.xml");
		Student student1 = (Student) context.getBean("raghav1");
		Student student2 = (Student) context.getBean("raghav2");
		Student student3 = (Student) context.getBean("raghav3");
		Student student4 = (Student) context.getBean("raghav4");
		Student student5 = (Student) context.getBean("raghav5");
	
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5);
	}
}
