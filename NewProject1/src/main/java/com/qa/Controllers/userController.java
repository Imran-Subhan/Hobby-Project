package com.qa.Controllers;

	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
		UserRegService userservice;

		
		//===============
		// Methods
		//===============

		@PostMapping("/AddUser")
	    public ResponseEntity<User> saverecord(@RequestBody User user) {
			User created = this.userservice.saveUser(user);
			
	     return new ResponseEntity<User>(created, HttpStatus.OK); 
	    }
		
		@GetMapping ("/showUsers")
		public ResponseEntity<List<User>> showUsers() {
			List<User> userlist = this.userservice.ShowUsers();
			
			return new ResponseEntity<List<User>>(userlist, HttpStatus.OK);
	}

		
		@GetMapping ("/showProfile/{id}")
		public ResponseEntity<User> showUsers(@PathVariable int id) {
			User oneuser = this.userservice.ShowProfile(id);
			
			return new ResponseEntity<User>(oneuser, HttpStatus.OK);
		}
		
		
		@DeleteMapping ("/DeleteUser/{id}")
		public ResponseEntity<Object> deletePlayer(@PathVariable int id) {
			 userservice.DeleteUser(id);
			 
			 return ResponseEntity.noContent().build();
	}
		@PutMapping ("/UpdateUser/{id}")
		public ResponseEntity<User> updateuser(@RequestBody User user, @PathVariable int id) {
			final User updateduser = userservice.updateaUser(user);
			
			return ResponseEntity.ok(updateduser);
		}
	}


