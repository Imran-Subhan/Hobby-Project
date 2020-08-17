//package com.qa.Controllers;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.assertj.core.api.Assertions;
//import org.hamcrest.Matchers;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultMatcher;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.qa.Entities.Player;
//import com.qa.Repositories.PlayerRepo;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class PControllerTest {
//
//	@Autowired
//    private MockMvc mock;
//
//    @MockBean
//    private PlayerRepo repo;
//
//    @InjectMocks
//    private ObjectMapper mapper = new ObjectMapper();
//    
//    private Player testplayer;
//    
//    private final Player TEST_SAVED_Player = new Player(10, "Ozil", 70, 70);
//    
//    private int id;
//    
//    @Before
//	public void init() {
//		this.repo.deleteAll();
//		this.testplayer = new Player(10, "Ozil", 70, 70);
//		
//		
//		
//    }
//    
//    @Test
//    public void testShowPlayers() throws Exception {
//		Mockito.when(this.repo.save(this.testplayer)).thenReturn(TEST_SAVED_Player);
//		MockHttpServletRequestBuilder mockrequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/AddPlayer");
//
//		mockrequest.contentType(MediaType.APPLICATION_JSON).content(this.mapper.writeValueAsString(testplayer))
//		.accept(MediaType.APPLICATION_JSON);
//		
//		Assertions.assertThat(this.repo.save(this.testplayer)).isEqualTo(this.TEST_SAVED_Player);
//		
//		Mockito.verify(this.repo, Mockito.times(1)).save(this.testplayer);
//		
//		ResultMatcher matchStatus = MockMvcResultMatchers.status().isCreated();
//		
//		ResultMatcher matchContent = MockMvcResultMatchers.content()
//				.json(this.mapper.writeValueAsString(TEST_SAVED_Player));
//		
//		this.mock.perform(get("/ShowPlayers"))
//		.andExpect(status().isOk())
//		.andExpect(content().json(this.mapper.writeValueAsString(TEST_SAVED_Player)));
//		.andExpect(jsonPath("$.playerno", Matchers.is(10)))
//		.andExpect(jsonPath("$.playername", Matchers.is("Ozil")))
//		.andExpect(jsonPath("$.attack", Matchers.is(70)))
//		.andExpect(jsonPath("$.defence", Matchers.is(70)));
//
//
//				
//		
//	}
    
    
    
//    
//}
