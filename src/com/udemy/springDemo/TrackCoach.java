package com.udemy.springDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run daily using C25K & Nike Run Club Android App and record your stats";
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
	
	public void InitializeMethod() {
		System.out.println("Inside init-method for Track Coach");
	}
	
	public void DestroyMethod() {
		System.out.println("Inside destroy-method for Track Coach");
	}

}