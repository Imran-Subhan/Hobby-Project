package com.qa.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	
	
	public Player() {
		super();
	}
	



	@Id
	private int playerno;
	private String playername;

	/// Constructor	
	public Player(String playername, int playerno) {
		super();
		this.playername = playername;
		this.playerno = playerno;
	}
	
	//===============
	// Methods
	//===============
	public int getPlayerno() {
		return playerno;
	}

	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	
	public void setPlayerno(int playerno) {
		this.playerno = playerno;
	}
	

}

