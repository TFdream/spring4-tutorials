package com.ricky.codelab.spring.aop.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ricky.codelab.spring.aop.service.UserService;

public class SpringAOPXmlMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop-xml.xml");

		UserService userService = (UserService) ctx.getBean("userService");
		userService.login("ricky", "123");

		userService.register("jack", "abc");

		ctx.close();
	}

}
