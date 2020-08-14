package com.qa.Controllers;

	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.qa.Entities.Player;
import com.qa.Entities.User;
	import com.qa.Services.UserRegService;

	@CrossOrigin
	@RestController
	public class userController {
		
		@Autowired
		UserRegService userRegserv;

		
		//===============
		// Methods
		//===============

		@PostMapping("/AddUser")
	    public String saverecord(@RequestBody User user) {
	     return userRegserv.saveUser(user); 
	    }
		
		@GetMapping ("/showUsers")
		public List<User> showUsers(User user) {
			System.out.println("hello");
			return userRegserv.ShowUsers(user);
		}
		
		@GetMapping ("/showProfile/{id}")
		public User showUsers(@PathVariable int id) {
			System.out.println("hello");
			return userRegserv.ShowProfile(id);
			}
		
		@DeleteMapping ("/DeleteUser/{id}")
		public String deleteUsers(@PathVariable int id) {
		return userRegserv.DeleteUser(id);
	}
		@PutMapping ("/UpdateUser/{id}")
		public String updateplayer(@RequestBody User user, @PathVariable int id) {
		return userRegserv.updateaUser(user);
		
		}
	}


