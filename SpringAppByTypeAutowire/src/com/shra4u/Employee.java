package com.shra4u;

public class Employee {

	Address address;
	
	public Employee() {
	
		System.out.println("Emp is created..");
		
		// TODO Auto-generated constructor stub
	}
	
	public Address getAddress()
	{
		return address;
	}
	
	public void setAddress(Address address )
	{
		this.address=address;
	}
	
	void print()
	{
		System.out.println("Here is Empppp");
	}
	void display()
	{
		print();
		address.print();
	}
}

