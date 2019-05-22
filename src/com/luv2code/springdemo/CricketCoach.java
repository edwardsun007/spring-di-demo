package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public CricketCoach() {}
	
	// setter dependency injection example
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
