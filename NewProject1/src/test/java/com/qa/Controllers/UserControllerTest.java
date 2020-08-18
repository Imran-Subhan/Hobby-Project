package com.qa.Controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

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
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.Entities.Player;
import com.qa.Entities.User;
import com.qa.Repositories.PlayerRepo;
import com.qa.Repositories.UserRegRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
	

	@Autowired
    private MockMvc mock;

    @MockBean
    private UserRegRepo repo;

    @InjectMocks
    private ObjectMapper mapper = new ObjectMapper();
    
    private User testuser;
    
    private final User TEST_SAVED_USER = new User(1, "Larry","qwerty");
    
    private final User TEST_UPDATED_USER = new User(1, "Larry","qwerty!*");
    
    private int id;
    
    @Before
	public void init() {
		this.repo.deleteAll();
		this.testuser = new User(1, "Larry","qwerty");	
		
    }
    
    @Test
    public void testShowUsers() throws Exception {
		
		this.mock.perform(get("/showUsers"))
		.andExpect(status().isOk());
			
    }
    
    @Test
    public void testShowProfile() throws Exception {
    	
    	Mockito.when(this.repo.findById(1)).thenReturn(Optional.of(testuser));
    	
    	MockHttpServletRequestBuilder mockrequest = MockMvcRequestBuilders.request(HttpMethod.GET,"/showProfile/{id}", "1");
    	
    	mockrequest.contentType(MediaType.APPLICATION_JSON).content(this.mapper.writeValueAsString(testuser))
    	.accept(MediaType.APPLICATION_JSON);
		
		this.mock.perform(mockrequest)
		.andExpect(status().isOk());
    	
    }
    
    @Test
    public void testAddUser() throws Exception {
    	
    	Mockito.when(this.repo.save(this.testuser)).thenReturn(TEST_SAVED_USER);
    	Assertions.assertThat(this.repo.save(this.testuser)).isEqualTo(this.TEST_SAVED_USER);
    	
    	MockHttpServletRequestBuilder mockrequest = MockMvcRequestBuilders.request(HttpMethod.POST, "/AddUser");
    	
    	mockrequest.contentType(MediaType.APPLICATION_JSON).content(this.mapper.writeValueAsString(testuser))
    	.accept(MediaType.APPLICATION_JSON);
    	
    	Mockito.verify(this.repo, Mockito.times(1)).save(this.testuser);
    	
    	this.mock.perform(mockrequest)
    	
    	.andExpect(status().isOk());
    }

    @Test
    public void testDeleteUser() throws Exception {
    	
    	MockHttpServletRequestBuilder mockrequest = MockMvcRequestBuilders.request(HttpMethod.DELETE, "/DeleteUser/{id}", "1");
    	
    	mockrequest.contentType(MediaType.APPLICATION_JSON)
    	.accept(MediaType.APPLICATION_JSON);
		
		this.mock.perform(mockrequest)
		.andExpect(status().isNoContent());
    
    
	}
    
    @Test
    public void testUpdateUser() throws Exception {
    	
    	MockHttpServletRequestBuilder mockrequest = MockMvcRequestBuilders.request(HttpMethod.PUT, "/UpdateUser/{id}", "1");
    	
    	
    	mockrequest.contentType(MediaType.APPLICATION_JSON).content(this.mapper.writeValueAsString(TEST_UPDATED_USER))
    	.accept(MediaType.APPLICATION_JSON);
		
		this.mock.perform(mockrequest)
		.andExpect(status().isOk());
    
    
}
    
    
}
