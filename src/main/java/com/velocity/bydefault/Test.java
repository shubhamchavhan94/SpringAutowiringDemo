package com.velocity.bydefault;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springContextDefault.xml");
		Student student=(Student) applicationContext.getBean("student");
		student.getData();
		
	}
}
