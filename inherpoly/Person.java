package com.yash.inheritance;

public class Person 
{
	private String name;
	private String address;
	public void show()
	{
		System.out.println("I am in person class::");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
}
