package com.qa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.Entities.Player;


@Repository
public interface PlayerRepo extends JpaRepository<Player, Integer> {

}
