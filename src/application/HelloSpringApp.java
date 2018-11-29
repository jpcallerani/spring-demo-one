package application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.br.springdemo.CricketCoach;

import application.interfaces.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach coach1 = context.getBean("baseBallCoach", Coach.class);
		Coach coach2 = context.getBean("trackCoach", Coach.class);
		CricketCoach coach3 = context.getBean("cricketCoach", CricketCoach.class);

		// call methods on the bean
		System.out.println("Baseball Coach!!");
		System.out.println(coach1.getDailyWorkout());
		System.out.println("---------------------------");
		//
		System.out.println("Track Coach!!");
		System.out.println(coach2.getDailyWorkout());
		System.out.println("---------------------------");
		//
		System.out.println("Cricket Coach!!");
		System.out.println(coach3.getDailyWorkout());
		System.out.println(coach3.getFortuneService().getFortune());
		System.out.println(coach3.getEmailAdress());
		System.out.println(coach3.getTeam());
		System.out.println("---------------------------");

		// close de context
		context.close();
	}

}
