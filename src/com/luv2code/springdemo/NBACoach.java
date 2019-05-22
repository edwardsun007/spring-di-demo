package com.luv2code.springdemo;

public class NBACoach implements Coach{
	
	private FortuneService fortuneService;  // declare the dependency object
	
	// dependency injection by constructor injection
	public NBACoach(FortuneService theFortuneService) { // inject just like you do it in Angular
		fortuneService = theFortuneService;  // constructor create instance of it
		fortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout() {
		String specialty = "Jump shot 20000 times make you the best shooter!";
		return specialty;
	}

	@Override
	public String getDailyFortune() {
		return "Best NBA coach!";
	}
	
}
