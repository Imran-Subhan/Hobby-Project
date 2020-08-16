package com.qa.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.Entities.Player;
import com.qa.Repositories.PlayerRepo;
import com.qa.Services.PlayerService;



@CrossOrigin
@RestController
public class PController {
	
	@Autowired
	PlayerService service;
	
	@Autowired
	PlayerRepo repo;
	
	@PostMapping ("/AddPlayer") 
	public ResponseEntity<Player> create(@RequestBody Player p) {
		Player created = this.service.create(p);
		return new ResponseEntity<>(created, HttpStatus.CREATED);
	}
	
	@GetMapping ("/ShowPlayers") 
	public List<Player> ShowAllPlayers() {
		return service.ShowallPlayers();
		
	}
	
	@GetMapping ("/Resetstats/{id}") 
	public String Reset(@PathVariable int id) {
		return service.UpdatePlayer(id);
		
	}
	@DeleteMapping ("/DeletePlayer/{id}")
	public String deletePlayer(@PathVariable int id) {
		return service.DeletePlayer(id);
}
	@PutMapping ("/UpdatePlayer/{id}")
	public String updateplayer(@RequestBody Player p, @PathVariable int id) {
	return service.updateaPlayer(p);
	
	}
	}
