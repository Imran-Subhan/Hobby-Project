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
	
	
	public Player create(Player p) {
		Player saved = this.repo.save(p);
		return saved;
	}
	
	public List<Player> ShowallPlayers(){
		return repo.findAll();
	}
	
	public void DeletePlayer(int id) { 
		repo.deleteById(id);
	}
		
		public Player updateaPlayer(Player p) {
			
			Player Updated = repo.save(p);
			return Updated;
		}
		
		}
			