package com.capg.beans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee)context.getBean("emp");
		context.registerShutdownHook();
		System.out.println("Employee ID is : " + emp.getEmp_id());
		System.out.println("Employee Name is : " + emp.getEmp_name());
		System.out.println("Employee City is : " +  emp.getAddress().getCity());
		context.close();
	}	
}
