package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.qa.hwa.PlayerRepo.PlayerRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class newplayerTest {
	
	@Autowired
    private MockMvc mock;

    @Autowired
    PlayerRepo repo;

}
