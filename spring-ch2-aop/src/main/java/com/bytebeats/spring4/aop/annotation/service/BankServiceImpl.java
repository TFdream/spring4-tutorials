package com.bytebeats.spring4.aop.annotation.service;

import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-04-03 11:12
 */
@Service
public class BankServiceImpl implements BankService {

    @Override
    public boolean transfer(String from, String to, int amount) {
        if(amount<1){
            throw new IllegalArgumentException("transfer amount must be a positive number");
        }
        System.out.println("["+from+"]向["+to+ "]转账金额"+amount);
        return false;
    }
}
