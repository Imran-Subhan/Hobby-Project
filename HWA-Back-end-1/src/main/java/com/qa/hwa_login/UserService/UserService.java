package com.qa.hwa_login.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.hwa_login.UserRepo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo Urepo;
	
	
}
