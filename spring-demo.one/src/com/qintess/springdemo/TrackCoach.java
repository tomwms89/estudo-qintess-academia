package com.qintess.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	
	// adc um m�todo de iniciar
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: dentro do m�todo doMyStartupStuff");
	}
	
	// adc um m�todo de destruir
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: dentro do m�todo doMyCleanupStuff");
	}

}
