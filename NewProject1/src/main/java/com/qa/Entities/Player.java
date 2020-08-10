package com.qa.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="players")
public class Player {



	@Id
	@Column (name = "playerno")
	private int playerno;
	@Column (name = "playername")
	private String playername;
	@Column (name = "Attack")
	private int Attack;
	@Column (name = "Defence")
	private int Defence;

	//===============
	/// Constructors	
	//===============
	public Player() {
		super();
	}
	public Player(int playerno, String playername, int Attack, int Defence) {
		super();
		this.playerno = playerno;
		this.playername = playername;
		this.Attack = Attack;
		this.Defence = Defence;
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
	public void setAttack(int Attack) {
		this.Attack = Attack;
	}
	public int getDefence() {
		return Defence;
	}
	public void setDefence(int Defence) {
		this.Defence = Defence;
	}
	@Override
	public String toString() {
		return "Player [playerno=" + playerno + ", playername=" + playername + ", Attack=" + Attack + ", Defence="
				+ Defence + "]";
	}
	
}