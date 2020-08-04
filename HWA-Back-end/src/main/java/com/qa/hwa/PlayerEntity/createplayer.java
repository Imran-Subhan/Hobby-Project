package com.qa.hwa.PlayerEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class createplayer {

	public int getATTACK() {
		return ATTACK;
	}
	public void setATTACK(int aTTACK) {
		ATTACK = aTTACK;
	}
	public int getPACE() {
		return PACE;
	}
	public void setPACE(int pACE) {
		PACE = pACE;
	}
	@Id
	private String Playername;
	public String getPlayername() {
		return Playername;
	}
	public void setPlayername(String playername) {
		Playername = playername;
	}
	private int ATTACK;
	private int PACE;
//	private int SHOOTING;
//	private int DEFENDING;
//	private int TACKLING;
//	private int PHYSICAL;
//	private int GOALKEEPING
}
