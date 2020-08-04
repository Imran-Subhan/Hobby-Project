package com.qa.hwa.PlayerRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.hwa.PlayerEntity.Player;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Integer> {

}
