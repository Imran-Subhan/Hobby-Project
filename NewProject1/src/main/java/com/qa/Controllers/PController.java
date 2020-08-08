package com.qa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.Entities.Player;
import com.qa.Services.PlayerService;


@CrossOrigin
@RestController
public class PController {
	
	@Autowired
	PlayerService service;
	
	@PostMapping ("/AddPlayer") 
	public String Addplayer(@RequestBody Player p) {
	return service.newPlayer(p);
	}
	
	@GetMapping ("/ShowPlayers") 
	public List<Player> ShowAllPlayers() {
		return service.ShowallPlayers();
		
	}
	
	@GetMapping ("/Resetstats") 
	public String Reset(@RequestBody int id) {
		return service.UpdatePlayer(id);
		
	}
	@DeleteMapping ("/DeletePlayer")
	public String deletePlayer(@RequestBody int id) {
		return service.DeletePlayer(id);
}
	

}
