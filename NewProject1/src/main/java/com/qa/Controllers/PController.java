package com.qa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	return "service.newPlayer(p)";
	}
	
	@GetMapping ("/ShowPlayers") 
	public List<Player> ShowAllPlayers() {
		return service.ShowallPlayers();
		
	}
	
	@PostMapping ("/newPlayer") 
	public String newPlayer(@RequestBody Player p) {
		System.out.println("works");
		System.out.println(p.getPlayername());
		return service.newPlayer(p);
		
	}
	@GetMapping ("/showall")
	public List<Player> showall(Player p) {
		return service.ShowallPlayers();
}
//	@GetMapping ("/inputStat")
//	public String inputStat(@RequestBody createplayer c) {
//		return service.showStat(c);
//	}
//	
	

}
