package com.qa.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.Entities.Player;
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
	
	public String DeletePlayer(int id) { 
		String message ="";
		Optional<User> user = Urepo.findById(id);
		if(user.isPresent()) {
			Urepo.deleteById(id);
			message= "record deleted";
		}else {
			message="cant delete with the id given";		
		}
	
		return message;
	}
		public String UpdatePlayer(int id) {
			String message ="";
			Optional<User> user = Urepo.findById(id);
			if(user.isPresent()) {
				Urepo.flush();
				message= "update record";
			}else {
				message="cant update with the id given";		
			}
		
			return message;
				
			}
}
