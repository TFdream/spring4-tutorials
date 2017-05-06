package com.bytebeats.spring4.aop.annotation;

import com.bytebeats.spring4.aop.annotation.service.BankService;
import com.bytebeats.spring4.aop.xml.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopAnnotationApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-aop-annotation.xml");

		BankService bankService = ctx.getBean(BankService.class);
		bankService.transfer("jordan", "kobe", 2000);

		System.out.println("*********************");
		bankService.transfer("jordan", "kobe", 100);

		ctx.close();
	}

}
