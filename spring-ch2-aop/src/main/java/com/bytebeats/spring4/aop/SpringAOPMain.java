package com.bytebeats.spring4.aop;

import com.bytebeats.spring4.aop.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		userService.login("ricky", "123");

		ctx.close();
	}

}
