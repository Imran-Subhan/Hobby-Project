package com.qa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.Entities.Player;
import com.qa.Repositories.PlayerRepo;


@Service
public class PlayerService {
	
	@Autowired
	PlayerRepo repo;
	
//	@Autowired
//	createplayerRepo createrepo;
	
	public String newPlayer(Player p) {
		String message ="Player added";
		repo.save(p);
		return message;
	}
	
//	public String showStat(createplayer c) {
//		createrepo.existsById(c);
//		return "Attack added ";
//	}
	public List<Player> ShowallPlayers(){
		return repo.findAll();
	}
}
