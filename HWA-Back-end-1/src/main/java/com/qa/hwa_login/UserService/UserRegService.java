package com.qa.hwa_login.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hwa.login.UserregRepo.UserRegRepo;
import com.qa.hwa_login.UserEntity.User;

@Service
public class UserRegService {
	
	

	@Autowired
	UserRegRepo Urepo;
	
	public String saveUser(User user) { 
		String message = "User Saved";
		Urepo.save(user);
		return message;
		
	}
	public String ShowUsers(User user) {
		String message = "User Table";
		Urepo.getOne(1);
		return message;
	}
}
