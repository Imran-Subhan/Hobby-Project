package com.qa.hwa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.hwa_login.UserEntity.User;
import com.qa.hwa_login.UserService.UserRegService;

@RestController
public class UserRegController {

	UserRegService userRegserv = new UserRegService(); 
	
	
	public UserRegController(UserRegService userRegserv) {
		super();
		this.userRegserv = userRegserv;
	}


	@PostMapping("/AddUser")
    public String saverecord(@RequestBody User user) {
     return userRegserv.saveUser(user);
       
       
    }
}
