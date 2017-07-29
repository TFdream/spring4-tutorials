package com.bytebeats.spring4.aop.xml.service;

public interface UserService {

	String login(String username, String passowrd);
	
	String register(String username, String passowrd);
}
