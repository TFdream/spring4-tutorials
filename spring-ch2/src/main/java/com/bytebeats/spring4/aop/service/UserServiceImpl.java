package com.bytebeats.spring4.aop.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public String login(String username, String passowrd) {
		System.out.println("login username:"+username+",passowrd:"+passowrd);
		return "OK";
	}

	@Override
	public String register(String username, String passowrd) {
		System.out.println("register username:"+username+",passowrd:"+passowrd);
		return "OK";
	}

}
