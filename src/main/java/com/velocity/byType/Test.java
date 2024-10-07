package com.velocity.byType;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Test {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("springType.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		Employee employee = (Employee) beanFactory.getBean("e");
		employee.getData();
	}

}
