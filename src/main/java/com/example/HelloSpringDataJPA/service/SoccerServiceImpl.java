package com.example.HelloSpringDataJPA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HelloSpringDataJPA.model.Player;
import com.example.HelloSpringDataJPA.model.Team;
import com.example.HelloSpringDataJPA.repository.PlayerRepository;
import com.example.HelloSpringDataJPA.repository.TeamRepository;

@Service
public class SoccerServiceImpl implements SoccerService {

	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private TeamRepository teamRepository;

	@Override
	public List<String> getAllTeamPlayers(long teamId) {
		List<String> result = new ArrayList<String>();
		
        List<Player> players = playerRepository.findByTeamId(teamId);
        for (Player player : players) {
        	System.out.println(player.getId()+" "+player.getName());
            result.add(player.getName());
            
        }
        return result;
	}

	@Override
	public void addPlayer(String name, String position, int number) {
		
		Team barcelona = teamRepository.findById(1l).get();
		
        Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setPosition(position);
        newPlayer.setNum(number);
        newPlayer.setTeam(barcelona);
        
        playerRepository.save(newPlayer);

	}

}
