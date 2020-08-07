package com.qa.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.Entities.Player;
import com.qa.Repositories.PlayerRepo;


@Service
public class PlayerService {
	
	@Autowired
	PlayerRepo repo;
	
	
	public String newPlayer(Player p) {
		String message ="Player added";
		repo.save(p);
		return message;
	}
	
	public List<Player> ShowallPlayers(){
		return repo.findAll();
	}
	
	public String DeletePlayer(int id) { 
		String message ="";
		Optional<Player> player = repo.findById(id);
		if(player.isPresent()) {
			repo.deleteById(id);
			message= "record deleted";
		}else {
			message="cant delete with the id given";		
		}
	
		return message;
	}
		public String UpdatePlayer(int id) {
			String message ="";
			Optional<Player> player = repo.findById(id);
			if(player.isPresent()) {
				repo.flush();
				message= "update record";
			}else {
				message="cant update with the id given";		
			}
		
			return message;
				
			}
		}
			