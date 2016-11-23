package com.ricky.codelab.spring.ioc;

public class UserDAO {
	private String user_name;
	private String password;
	
	public String getUserName() {
		return user_name;
	}
	public void setUserName(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserDAO [user_name=" + user_name + ", password=" + password
				+ "]";
	}
	
}
