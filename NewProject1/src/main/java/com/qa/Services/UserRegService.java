package com.qa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.Entities.User;
import com.qa.Repositories.UserRegRepo;

@Service
public class UserRegService {	

	@Autowired
	UserRegRepo Urepo;
	
	public String saveUser(User user) { 
		String message = "User Saved";
		Urepo.save(user);
		return message;
		
	}
	public List<User> ShowUsers(User user) {
		
		return Urepo.findAll();
	}
}
