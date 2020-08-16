package com.qa;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.Entities.Player;
import com.qa.Repositories.PlayerRepo;
import com.qa.Services.PlayerService;

@RunWith(SpringRunner.class)
@SpringBootTest
class NewProject1ApplicationTests {

	@Autowired
	private PlayerService service;
	
	@MockBean
	private PlayerRepo repo;
	
	@Test
	public void ShowallPlayers() {
		when(repo.findAll()).thenReturn(Stream
				.of(new Player(10, "Ozil", 70, 70), new Player(7, "Saka", 75, 60)).collect(Collectors.toList()));
		assertEquals(2, service.ShowallPlayers().size());
	}
	
	@Test
	public void CreateTest() {
		Player player = new Player(10, "Ozil", 70, 70);
		when(repo.save(player)).thenReturn(player);
		assertEquals(player, service.create(player));
	}


}
