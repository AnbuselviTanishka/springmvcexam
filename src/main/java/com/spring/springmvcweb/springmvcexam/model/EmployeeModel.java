package com.spring.springmvcweb.springmvcexam.model;

public class EmployeeModel {
	
	@Override
	public String toString() {
		return "EmployeeModel [name=" + name + ", city=" + city + "]";
	}
	private String name;
	private String city;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
