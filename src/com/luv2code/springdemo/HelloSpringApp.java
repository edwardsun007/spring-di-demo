package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		System.out.println("Starting...");
		//1. load the spring configuration file / open the context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2. retrieve bean from spring configuration
		Coach theCoach = context.getBean("myCoach",Coach.class);  // here bean id is the name myCoach, interface is Coach
		
		//3. call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//4. call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//5. close the context
		context.close();
	}

}
