package com.br.springdemo;

import application.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is you luck day!";
	}
}
