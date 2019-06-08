package com.udemy.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		create container for the application(load spring configuration file)
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
//		Retrieve bean from Spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
//		checking if the bean points to same location
		
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
		
	}

}
