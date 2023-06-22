package com.raghav.refernceInjection;

public class ClassA {
	private String lastName;
	private String motherLastName;
	private String fatherLastName;
	
	public ClassA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassA(String lastName, String motherLastName, String fatherLastName) {
		super();
		this.lastName = lastName;
		this.motherLastName = motherLastName;
		this.fatherLastName = fatherLastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMotherLastName() {
		return motherLastName;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public String getFatherLastName() {
		return fatherLastName;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	@Override
	public String toString() {
		return "ClassA [lastName=" + lastName + ", motherLastName=" + motherLastName + ", fatherLastName="
				+ fatherLastName + "]";
	}
	
	
}
