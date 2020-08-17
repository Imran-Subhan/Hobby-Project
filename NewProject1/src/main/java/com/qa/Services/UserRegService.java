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
	
	public User saveUser(User user) { 
		User saved = this.Urepo.save(user);
		return saved;
		
	}
	public List<User> ShowUsers() {
		
		return Urepo.findAll();
	}
	
public User ShowProfile(int id) {
		
	return Urepo.findById(id).get();

}

	public String DeleteUser(int id) { 
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
		
		public User updateaUser(User user) {
			
			User updateduser = Urepo.save(user);
			
			return updateduser;
		}
}
