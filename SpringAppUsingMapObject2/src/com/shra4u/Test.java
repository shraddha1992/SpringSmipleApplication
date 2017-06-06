package com.shra4u;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//way 2 : Using ApplicationContext interface
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		
		Employee emp = (Employee) context.getBean("employee");
		
		System.out.println(emp);
		
	}
}
