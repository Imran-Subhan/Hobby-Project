package com.qa.hwa.login.UserregRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.hwa_login.UserEntity.User;

@Repository
public interface UserRegRepo extends JpaRepository<User, Integer> {

}
