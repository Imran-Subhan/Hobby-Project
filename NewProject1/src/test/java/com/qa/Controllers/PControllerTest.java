package com.qa.Controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.Entities.Player;
import com.qa.Repositories.PlayerRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PControllerTest {

	@Autowired
    private MockMvc mock;

    @MockBean
    private PlayerRepo repo;

    @InjectMocks
    private ObjectMapper mapper = new ObjectMapper();
    
    private Player testplayer;
    
    private Player testplayerwithID;
    
    private final Player TEST_SAVED_Player = new Player(7, "Saka", 70, 70);
    
    private int id;
    
    @Before
	public void init() {
		this.repo.deleteAll();
		this.testplayer = new Player(7, "Saka", 70, 70);
		this.testplayerwithID = this.repo.save(this.testplayer);
		
		
    }
    
    @Test
    public void testCreate() throws Exception {
		Mockito.when(this.repo.save(this.testplayer)).thenReturn(TEST_SAVED_Player);
		MockHttpServletRequestBuilder mockrequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/AddPlayer");

		mockrequest.contentType(MediaType.APPLICATION_JSON).content(this.mapper.writeValueAsString(testplayer))
		.accept(MediaType.APPLICATION_JSON);
		
		Assertions.assertThat(this.repo.save(this.testplayer)).isEqualTo(this.TEST_SAVED_Player);
		
//		Mockito.verify(this.repo, Mockito.times(1)).save(this.testplayer);
		
		ResultMatcher matchStatus = MockMvcResultMatchers.status().isCreated();
		
		ResultMatcher matchContent = MockMvcResultMatchers.content()
				.json(this.mapper.writeValueAsString(TEST_SAVED_Player));
		
		this.mock.perform(post("/AddPlayer"))
		.andExpect(status().isCreated());
//		.andExpect(content().json(this.mapper.writeValueAsString(TEST_SAVED_Player)));
		
				
		
	}
    
    
    
    
}
