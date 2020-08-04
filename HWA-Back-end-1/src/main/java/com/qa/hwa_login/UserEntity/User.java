package com.qa.hwa_login.UserEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@Column (name = "userid")
	private int userid;
	
	@Column (name = "username")
	private String username;
	
	@Column (name = "password")
	private String password;
	
//	@ManytoMany(cascade = CascadeType.All)
//	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"), )
}
