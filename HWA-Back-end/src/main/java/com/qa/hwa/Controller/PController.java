package com.qa.hwa.Controller;

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
	
	@PostMapping ("/newPlayer") 
	public String newPlayer(@RequestBody Player p) {
		return service.newPlayer(p);
		
	}
	@GetMapping ("/inputStat")
	public String inputStat(@RequestBody createplayer c) {
		return service.showStat(c);
	}
	

}
