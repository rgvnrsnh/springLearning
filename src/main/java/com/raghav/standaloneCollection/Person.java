package com.raghav.standaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private List<String> friend;
	private Map<String, Double> courses;
	private Properties props;
	private Set<Integer> val;
	
	
	public List<String> getFriend() {
		return friend;
	}
	
	public void setFriend(List<String> friend) {
		this.friend = friend;
	}
	
	public Map<String, Double> getCourses() {
		return courses;
	}
	
	public void setCourses(Map<String, Double> courses) {
		this.courses = courses;
	}
	
	public Properties getProps() {
		return props;
	}
	
	public void setProps(Properties props) {
		this.props = props;
	}
	
	public Set<Integer> getVal() {
		return val;
	}
	
	public void setVal(Set<Integer> val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "Person [friend=" + friend + ", courses=" + courses + ", props=" + props + ", val=" + val
				+ ", getFriend()=" + getFriend() + ", getCourses()=" + getCourses() + ", getProps()=" + getProps()
				+ ", getVal()=" + getVal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
