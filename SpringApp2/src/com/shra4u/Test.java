package com.shra4u;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		// Way 1 : Using Beanfactory interface
		/*Resource resource = new ClassPathResource("spring.xml");
		
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(resource);*/
		
		//way 2 : Using ApplicationContext interface
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		
		Student student = (Student) context.getBean("student1");
		
		System.out.println("Student ID: "+student.getId());
		System.out.println("Student Name: "+student.getName());
		System.out.println("Student Age: "+student.getAge());
		
	}
}
