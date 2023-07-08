package com.mvc4.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
    @Id
	private String email;
    
	private String userName;
	private String password;
	private String nickName;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public User(String email, String userName, String password, String nickName) {
		super();
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.nickName = nickName;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", userName=" + userName + ", password=" + password + ", nickName=" + nickName
				+ "]";
	}
	

	
	
}
