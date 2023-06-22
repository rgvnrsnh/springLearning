package com.raghav.constructorinjection;

import java.util.List;

public class Student {
	private String nameString;
	private int rollNum;
	private String classString;
	private Certificate cert;
	private List<String> lst;
	
	public Student(String nameString, String classString) {
		super();
		this.nameString = nameString;
		this.classString = classString;
	}

	public Student(String nameString, int rollNum) {
		super();
		this.nameString = nameString;
		this.rollNum = rollNum;
	}

	public Student(String nameString, int rollNum, String classString, Certificate cert) {
		super();
		this.nameString = nameString;
		this.rollNum = rollNum;
		this.classString = classString;
		this.cert = cert;
	}
	
	

	public Student(String nameString, int rollNum, String classString, Certificate cert, List<String> lst) {
		this(nameString, rollNum, classString, cert);
		this.lst = lst;
	}

	@Override
	public String toString() {
		return "Student [nameString=" + nameString + ", rollNum=" + rollNum + ", classString=" + classString + ", cert="
				+ cert + ", lst=" + lst + "]";
	}
	
}
