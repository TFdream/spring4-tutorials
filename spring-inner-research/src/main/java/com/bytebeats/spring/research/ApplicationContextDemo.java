package com.bytebeats.spring.research;

import com.bytebeats.spring.research.model.User;
import com.bytebeats.spring.research.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @date 2017-03-02 18:44
 */
public class ApplicationContextDemo {

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-bean.xml");
        UserService userService = context.getBean("userService", UserService.class);

        User user = new User();
        user.setId(15L);
        user.setName("ricky");
        boolean success = userService.addUser(user);
        System.out.println("success:"+success);
    }
}
