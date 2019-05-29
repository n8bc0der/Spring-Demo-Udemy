package com.udemy.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Creating container for the application
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Retrieving the bean from the container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
//		Calling the application method for the functionality that is needed
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
//		closing the container
		context.close();

	}

}
