package com.qintess.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// carregar o arquivo configura��o do spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// recuperar bean do spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// chamar os m�todos no bean
		// voltar depois
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		
		// close o context
		context.close();
	}

}
