package com.qa.Entities;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {

	@Id
	@Generated(value = { "userid" }) 
	@Column (name = "userid")
	private int userid;
	
	@Column (name = "username")
	private String username;
	
	@Column (name = "password")
	private String password;
	
	

	public User() {
		super();
	}


	public User(int userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}


	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + "]";
	}
	
	
//	@ManytoMany(cascade = CascadeType.All)
//	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"), )
}
