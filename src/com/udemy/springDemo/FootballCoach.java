package com.udemy.springDemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	private RandomFortuneService randomFortuneService;
	
	private String emailAddress;
	private String team;
	
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside Football Coach setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside Football Coach setter method - setTeam");
		this.team = team;
	}

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return randomFortuneService.getRandomFortune();
	}

	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		System.out.println("Inside Football Coach setter method - setRandomFortuneService");
		this.randomFortuneService = randomFortuneService;
	}


	
//	public void display() {
//		System.out.println("Checking the functionality");
//	}

}
