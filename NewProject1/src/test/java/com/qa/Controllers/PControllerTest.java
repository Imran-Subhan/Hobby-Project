package com.qa.Controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
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
import org.springframework.mock.web.MockHttpServletRequest;
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
    
    private final Player TEST_SAVED_Player = new Player(10, "Ozil", 70, 70);
    
    private final Player TEST_UPDATED_Player = new Player(10, "Ozil", 90, 65);
    
    private int id;
    
    @Before
	public void init() {
		this.repo.deleteAll();
		this.testplayer = new Player(10, "Ozil", 70, 70);
		
		
		
    }
    
    @Test
    public void testShowPlayers() throws Exception {
		
		this.mock.perform(get("/ShowPlayers"))
		.andExpect(status().isOk());
			
    }
    
    @Test
    public void testAddPlayers() throws Exception {
    	
    	Mockito.when(this.repo.save(this.testplayer)).thenReturn(TEST_SAVED_Player);
    	Assertions.assertThat(this.repo.save(this.testplayer)).isEqualTo(this.TEST_SAVED_Player);
    	
    	MockHttpServletRequestBuilder mockrequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/AddPlayer");
    	
    	mockrequest.contentType(MediaType.APPLICATION_JSON).content(this.mapper.writeValueAsString(testplayer))
    	.accept(MediaType.APPLICATION_JSON);
    	
    	Mockito.verify(this.repo, Mockito.times(1)).save(this.testplayer);
    	
    	this.mock.perform(mockrequest)
    	
    	.andExpect(status().isOk());
    }
    
    @Test
    public void testDeletePlayers() throws Exception {
    	
    	MockHttpServletRequestBuilder mockrequest = MockMvcRequestBuilders.request(HttpMethod.DELETE, "/DeletePlayer/{id}", "10");
    	
    	mockrequest.contentType(MediaType.APPLICATION_JSON)
    	.accept(MediaType.APPLICATION_JSON);
		
		this.mock.perform(mockrequest)
		.andExpect(status().isNoContent());
    
    
	}
    
    @Test
    public void testUpdateaPlayer() throws Exception {
    	
    	MockHttpServletRequestBuilder mockrequest = MockMvcRequestBuilders.request(HttpMethod.PUT, "/UpdatePlayer/{id}", "10");
    	
    	
    	mockrequest.contentType(MediaType.APPLICATION_JSON).content(this.mapper.writeValueAsString(TEST_UPDATED_Player))
    	.accept(MediaType.APPLICATION_JSON);
		
		this.mock.perform(mockrequest)
		.andExpect(status().isOk());
    
    
}
}
//	MockHttpServletRequestBuilder mockrequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/AddPlayer");
//
//	
//	
//	
//	
//	;
//	
//	ResultMatcher matchStatus = MockMvcResultMatchers.status().isCreated();
//	
//	ResultMatcher matchContent = MockMvcResultMatchers.content()
//			.json(this.mapper.writeValueAsString(TEST_SAVED_Player));
