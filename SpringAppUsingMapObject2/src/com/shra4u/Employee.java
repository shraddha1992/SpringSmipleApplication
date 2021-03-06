package com.shra4u;


import java.util.Map;

public class Employee {

	private int id;
	private String name;
	private int age;
	private Map<User,Answer> address;
	
	
	
	
	public Employee(int id, String name, int age, Map<User, Answer> address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<User, Answer> getAddress() {
		return address;
	}
	public void setAddress(Map<User, Answer> address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age
				+ ", address=" + address + "]";
	}
	
}

