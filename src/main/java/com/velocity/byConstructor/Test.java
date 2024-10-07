package com.velocity.byConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextConstructor.xml");
			
			Employee employee = (Employee) applicationContext.getBean("e");
			employee.getData();
		}
}
