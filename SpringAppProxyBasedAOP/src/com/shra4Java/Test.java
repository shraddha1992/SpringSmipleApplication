package com.shra4Java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  
	      
	    Performer performer = (Performer)context.getBean("proxyBean");
		
	    try {
	    	performer.perform();
		} catch (Exception e) {
			System.out.println("Catching the exception");
		}
	    
	}
	
	
}
