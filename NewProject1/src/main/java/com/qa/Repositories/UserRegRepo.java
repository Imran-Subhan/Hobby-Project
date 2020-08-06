package com.qa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.Entities.User;


@Repository
public interface UserRegRepo extends JpaRepository<User, Integer> {

}
