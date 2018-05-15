package com.example.HelloSpringDataJPA.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.HelloSpringDataJPA.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
	
	
	Team findByPlayers(long playerId);
	
	
}
