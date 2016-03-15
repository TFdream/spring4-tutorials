package com.ricky.codelab.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		//2. 从 IOC 容器中获取 bean 的实例
		UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
		System.out.println(userDAO.toString());
		
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		UserService userService = (UserService) ctx.getBean("service");
		System.out.println(userService);
		
		Action action = (Action) ctx.getBean("action");
		System.out.println(action);
		
		ctx.close();
	}
}
