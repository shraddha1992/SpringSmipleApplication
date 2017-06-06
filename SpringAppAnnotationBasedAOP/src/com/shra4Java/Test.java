package com.shra4Java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

public static void main(String[] args) {		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Performer performer = (Performer)context.getBean("targetBean");
		
		try {
			performer.perform();
		} catch (PerformanceException e) {
			//e.printStackTrace();
		}
		
	}
	
}
