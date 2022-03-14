package com.capg.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	

	private Address address;

	public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
	
public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor injection");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter injection");
	}

	public String display() {
		return "Employee [address=" + address + "]";
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
