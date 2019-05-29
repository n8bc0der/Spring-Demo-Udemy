package com.udemy.springDemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
//	public FootballCoach(FortuneService thefortuneService) {
//		// TODO Auto-generated constructor stub
//		
//		fortuneService = thefortuneService;
//	}
	
	public FootballCoach() {
		System.out.println("Inside Football Coach constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Football Coach setter method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Long Passes using studs + Practice dribbling + Practice possession";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}


	
//	public void display() {
//		System.out.println("Checking the functionality");
//	}

}
