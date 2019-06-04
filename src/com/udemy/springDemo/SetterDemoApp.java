package com.udemy.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create container for the class/application
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");

		//Retrieve the bean from the container
		FootballCoach footballCoach = context.getBean("myFootballCoach",FootballCoach.class);
		
		//Call application specific method required for the functionality
		System.out.println(footballCoach.getDailyWorkout());
		
		System.out.println(footballCoach.getDailyFortune());
		
		System.out.println(footballCoach.getEmailAddress());
		
		System.out.println(footballCoach.getTeam());
		
		System.out.println(footballCoach.getRandomFortune());
		
		//close the container
		context.close();
		
		
	}

}
