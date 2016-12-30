package com.bytebeats.spring4.aop.service;

public interface UserService {

	public String login(String username, String passowrd);
	
	public String register(String username, String passowrd);
}
