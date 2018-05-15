package com.example.HelloSpringDataJPA.service;

import java.util.List;


public interface SoccerService {
	
    public List<String> getAllTeamPlayers(long teamId);
    
    public void addPlayer(String name, String position, int number);
    
}