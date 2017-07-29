package com.bytebeats.spring.profile;

import com.bytebeats.spring.profile.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        HelloService helloService = (HelloService) ctx.getBean("helloService");
        helloService.sayHello("ricky");
    }
}
