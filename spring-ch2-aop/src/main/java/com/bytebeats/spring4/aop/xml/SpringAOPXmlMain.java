package com.bytebeats.spring4.aop.xml;

import com.bytebeats.spring4.aop.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPXmlMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop-xml.xml");

		UserService userService = (UserService) ctx.getBean("userService");
		userService.login("ricky", "123");

		userService.register("jack", "abc");

		ctx.close();
	}

}
