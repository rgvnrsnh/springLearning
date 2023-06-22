package com.raghav.refernceInjection;

public class ClassB {
	private String firstName;
	private String motherFirstName;
	private String fatherFirstName;
	private ClassA objA;
	
	public ClassB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClassB(String firstName, String motherFirstName, String fatherFirstName, ClassA objA) {
		super();
		this.firstName = firstName;
		this.motherFirstName = motherFirstName;
		this.fatherFirstName = fatherFirstName;
		this.objA = objA;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMotherFirstName() {
		return motherFirstName;
	}

	public void setMotherFirstName(String motherfirstName) {
		this.motherFirstName = motherfirstName;
	}

	public String getFatherFirstName() {
		return fatherFirstName;
	}

	public void setFatherFirstName(String fatherfirstName) {
		this.fatherFirstName = fatherfirstName;
	}

	public ClassA getObjA() {
		return objA;
	}

	public void setObjA(ClassA objA) {
		this.objA = objA;
	}

	@Override
	public String toString() {
		return "ClassB [firstName=" + firstName + ", motherfirstName=" + motherFirstName + ", fatherfirstName="
				+ fatherFirstName + ", objA=" + objA + "]";
	}
	
	public void fullName() {
		System.out.println(this.firstName + " " + this.objA.getLastName() );
		System.out.println(this.fatherFirstName + " " + this.objA.getFatherLastName());
		System.out.println(this.motherFirstName + " " + this.objA.getMotherLastName());
	}
}
