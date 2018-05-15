package com.example.HelloSpringDataJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.HelloSpringDataJPA.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

	List<Player> findByTeamId(long teamId);

	@Query("SELECT p.name FROM Player p where p.id = :id")
	String findPlayerNameByID(@Param("id") Long id);

	/*
	 
	 @Query("SELECT t.title FROM Todo t where t.id = ?1")
	Optional<String> findTitleById(Long id);
	
	*/
}