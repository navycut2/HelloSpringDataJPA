package com.example.HelloSpringDataJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.HelloSpringDataJPA.service.SoccerService;

@SpringBootApplication
public class HelloSpringDataJpaApplication implements CommandLineRunner{

	@Autowired
	SoccerService soccerService;

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		soccerService.addPlayer("Xavi Hernandez", "Midfielder", 6);
		
		List<String> players = soccerService.getAllTeamPlayers(1);
		for (String player : players) {
			System.out.println("Introducing Barca player => " + player);
		}
		
		System.out.println("get Player NAME "+soccerService.getPlayerNameByID(1l));
		
	}
}
