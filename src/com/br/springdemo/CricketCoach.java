package com.br.springdemo;

import application.interfaces.Coach;
import application.interfaces.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAdress;
	private String team;

	public CricketCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "get Some Cricket today!";
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
