package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hwa.PlayerEntity.Player;
import com.qa.hwa.PlayerEntity.createplayer;
import com.qa.hwa.PlayerServices.PlayerService;

@CrossOrigin
@RestController
public class PController {
	
	@Autowired
	PlayerService service;
	
	@GetMapping ("/") 
	public String home() {

		return "service.newPlayer(p)";
		
	}
	
	@GetMapping ("/one") 
	public String newPlayer() {
		System.out.println("works");
		
		return "service.newPlayer(p)";
		
	}
	
	@PostMapping ("/newPlayer") 
	public String newPlayer(@RequestBody Player p) {
		System.out.println("works");
		System.out.println(p.getPlayername());
		return "service.newPlayer(p)";
		
	}
	@GetMapping ("/showall")
	public List<Player> showall(Player p) {
		return service.ShowallPlayers();
	}
	@GetMapping ("/inputStat")
	public String inputStat(@RequestBody createplayer c) {
		return service.showStat(c);
	}
	
	

}
