package com.raghav.collectioninjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> phone;
	private Set<String> city;
	private Map<String, String> courses;
	
	public Employee() {
		super();
	}

	public Employee(String name, List<String> phone, Set<String> city, Map<String, String> courses) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Set<String> getCity() {
		return city;
	}

	public void setCity(Set<String> city) {
		this.city = city;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", city=" + city + ", courses=" + courses + "]";
	}
}
