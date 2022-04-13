package com.training.assignment.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Cat cat1 = (Cat)context.getBean("cat1");
		Dog dog1 = (Dog)context.getBean("dog1");
		Person person1 = (Person)context.getBean("person1");
		
		System.out.println(cat1.getDetails());
		System.out.println(dog1.getDetails());
		System.out.println(person1.getDetails());
	}

}

