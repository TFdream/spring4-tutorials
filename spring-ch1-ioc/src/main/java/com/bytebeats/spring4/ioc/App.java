package com.bytebeats.spring4.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ThreadPoolExecutor pool = (ThreadPoolExecutor) ctx.getBean("threadPool");

		System.out.println(pool.getCorePoolSize());

		pool.shutdown();
	}
}
