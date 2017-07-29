package com.bytebeats.spring4.extension.service.impl;

import com.bytebeats.spring4.extension.service.IAccountService;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-23 14:45
 */
public class AccountServiceImpl implements IAccountService {

    @Override
    public String getAccountNameById(long id) {

        return "ricky";
    }
}
