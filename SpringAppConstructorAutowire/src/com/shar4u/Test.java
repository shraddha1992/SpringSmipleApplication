package com.shar4u;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	TextEditor textEditor = (TextEditor) context.getBean("texteditor");
//	textEditor.spellCheck();
	
	
}
