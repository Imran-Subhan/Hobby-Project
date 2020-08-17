package com.qa;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.catalina.Context;
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
		assertEquals(2, service.ShowallPlayers().size());}
	}
//	
//	@Test
//	public void CreateTest() {
//		Player player = new Player(10, "Ozil", 70, 70);
//		when(repo.save(player)).thenReturn(player);
//		assertEquals(player, service.create(player));
//	}
//	
//	@Test
//	public void DeletePlayerTest() {
//		Player player = new Player(10, "Ozil", 70, 70);
//		service.DeletePlayer(10);
//		verify(repo, times(1)).deleteById(10);
//		}
//	@Test
//	public void UpdateAPlayerTest() {
//		Player player = new Player(10, "Ozil", 70, 70);
//		Player Updated_player = new Player(10, "Ozil", 85, 75);
//		when(repo.save(player)).thenReturn(player);
//		when(repo.save(Updated_player)).thenReturn(Updated_player);
//		assertEquals(Updated_player, service.updateaPlayer(Updated_player));
//		assertNotSame(player, Updated_player);
//		
//	}
//	}

	


