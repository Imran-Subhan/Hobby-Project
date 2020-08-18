package com.qa.Entities;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
	
		
	    @Test
	    public void testToString()
	    {
	        Player player = new Player();
	        String expected = "Player [playerno=" + player.getPlayerno() + ", playername=" + player.getPlayername() + ", Attack=" + player.getAttack()
	        + ", Defence=" + player.getDefence() + "]"; 
	        Assert.assertEquals(expected, player.toString());
	    }
	}

