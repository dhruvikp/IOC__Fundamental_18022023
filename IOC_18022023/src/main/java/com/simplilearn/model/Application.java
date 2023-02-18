package com.simplilearn.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee e1 = (Employee) context.getBean("e1");
		System.out.println(e1.getFirstName() + "," + e1.getLastName() + "," + e1.getAddress().getCity() + ","
				+ e1.getAddress().getState() + "," + e1.getAddress().getCountry());
	}
}
