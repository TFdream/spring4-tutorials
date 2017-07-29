package com.bytebeats.spring4.ioc.sample;

public class Action {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String toString() {
		return "Action [userService=" + userService + "]";
	}
	
}
