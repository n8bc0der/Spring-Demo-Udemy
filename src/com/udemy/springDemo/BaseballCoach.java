package com.udemy.springDemo;

public class BaseballCoach implements Coach{

	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}
	
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Daily Practice Routine of Hitting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		
		
		return fortuneService.getDailyFortune();
	}

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
