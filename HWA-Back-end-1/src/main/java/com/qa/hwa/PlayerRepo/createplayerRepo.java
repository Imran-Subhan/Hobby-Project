package com.qa.hwa.PlayerRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.hwa.PlayerEntity.createplayer;
	
	@Repository 
	public interface createplayerRepo extends JpaRepository<createplayer, Integer> {

		void existsById(createplayer c);
		
		
	}
	

