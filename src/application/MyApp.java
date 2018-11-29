package application;

import com.br.springdemo.BaseballCoach;
import com.br.springdemo.TrackCoach;

import application.interfaces.Coach;

public class MyApp {

	public static void main(String[] args) {
		BaseballCoach coach1 = new BaseballCoach();
		Coach coach2 = new TrackCoach();
		
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach2.getDailyWorkout());
	}

}
