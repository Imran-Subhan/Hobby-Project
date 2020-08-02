package com.qa.hwa.PlayerServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hwa.PlayerEntity.Player;
import com.qa.hwa.PlayerRepo.PlayerRepo;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepo repo;
	
	public String newPlayer(Player p) {
		repo.save(p);
		return "Player added";
	}

}
