package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Cricket: inside no-arg constructor");
	}
	
	
	// setter dependency injection example
	// remember <property name="fortuneService" ref="myFortune"/> the value for name has to be exactly same as the parameter name here
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket: inside setFortuneService method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Fast bowling for 15 mins...";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
}
