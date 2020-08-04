package com.qa.hwa_login.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.hwa_login.UserEntity.User;

@Repository
public interface UserRepo extends JpaRepository <User,Integer> {
	
	

}
