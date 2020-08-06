package com.qa.hwa_login.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hwa.login.UserregRepo.UserRegRepo;

@Service
public class UserRegService {

	@Autowired
	UserRegRepo Urepo;
	
	
}
