package com.capg.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	
	private int emp_id;
	private String emp_name;
	
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
	}
	

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	public void init(){
	
		System.out.println("init");
	}
	
	public void destroy(){
		System.out.println("destroy");
		
	}
}
