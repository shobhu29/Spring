package com.capg.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee)context.getBean("emp");
		System.out.println("Employee ID is :  " +emp.getEmp_id());
		System.out.println("Employee Name is :  " + emp.getEmp_name());
	}	
}
