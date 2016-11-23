package com.bytebeats.spring4.extension.service.impl;

import com.bytebeats.spring4.extension.service.IHelloService;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-23 14:43
 */
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String msg) {
        System.out.println("Hello, "+msg);
        return "Hello, "+msg;
    }
}
