package com.qa.hwa.PlayerServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hwa.PlayerEntity.Player;
import com.qa.hwa.PlayerEntity.createplayer;
import com.qa.hwa.PlayerRepo.PlayerRepo;
import com.qa.hwa.PlayerRepo.createplayerRepo;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepo repo;
	
	@Autowired
	createplayerRepo createrepo;
	
	public String newPlayer(Player p) {
		repo.save(p);
		return "Player added";
	}
	
	public String showStat(createplayer c) {
		createrepo.existsById(c);
		return "Attack added ";
	}

}
