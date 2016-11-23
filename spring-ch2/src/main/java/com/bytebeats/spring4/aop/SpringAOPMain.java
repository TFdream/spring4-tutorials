package com.bytebeats.spring4.aop;

import com.ricky.codelab.spring.aop.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");
		
		UserService userService = (UserService) ctx.getBean("userService");
		userService.login("ricky", "123");
		
		userService.register("jack", "abc");
		
		ctx.close();
	}

}
