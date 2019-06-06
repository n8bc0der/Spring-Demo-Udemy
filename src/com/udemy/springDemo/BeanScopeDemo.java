package com.udemy.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		create container for the application(load spring configuration file)
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
//		Retrieve bean from Spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
//		checking if the bean points to same location
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Do they point to the same object : " + result);
		
		System.out.println("Memory location for the bean theCoach : " + theCoach);
		
		System.out.println("Memory location for the bean alphaCoach : " + alphaCoach);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
		
	}

}
