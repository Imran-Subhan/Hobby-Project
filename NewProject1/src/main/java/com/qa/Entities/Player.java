package com.qa.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {



	@Id
	private int playerno;
	private String playername;
	private int Attack;
	private int Defence;

	//===============
	/// Constructor	
	//===============
	public Player() {
		super();
	}
	public Player(int playerno, String playername, int attack, int defence) {
		super();
		this.playerno = playerno;
		this.playername = playername;
		Attack = attack;
		Defence = defence;
	}

	//===============
	// Methods
	//===============
	public int getPlayerno() {
		return playerno;
	}
	public void setPlayerno(int playerno) {
		this.playerno = playerno;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getAttack() {
		return Attack;
	}
	public void setAttack(int attack) {
		Attack = attack;
	}
	public int getDefence() {
		return Defence;
	}
	public void setDefence(int defence) {
		Defence = defence;
	}
	@Override
	public String toString() {
		return "Player [playerno=" + playerno + ", playername=" + playername + ", Attack=" + Attack + ", Defence="
				+ Defence + "]";
	}
	
}