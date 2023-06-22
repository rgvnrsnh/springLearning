package com.raghav.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address2")           // to specify autowired that which bean to be used
	private Address addressVal;

	
	public Employee() {
		super();
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
