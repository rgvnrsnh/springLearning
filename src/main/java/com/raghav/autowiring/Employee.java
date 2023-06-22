package com.raghav.autowiring;

public class Employee {
	private Address addressVal;

	
	public Employee() {

	}

	public Address getAddressVal() {
		return addressVal;
	}

	public void setAddressVal(Address addressVal) {
		this.addressVal = addressVal;
		
	}
	
	

	public Employee(Address addressVal) {
		super();
		this.addressVal = addressVal;
		System.out.println("this constructor will be called by bean");
	}

	@Override
	public String toString() {
		return "Employee [addressVal=" + addressVal + "]";
	}

}
