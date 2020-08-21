package com.qa.Entities;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
	
	    @Test
	    public void testToString()
	    {
	        User user = new User();
	        String expected = "User [userid=" + user.getUserid() + ", username=" + user.getUsername() + ", password=" + user.getPassword() + "]"; 
	        Assert.assertEquals(expected, user.toString());
	    }
	}

