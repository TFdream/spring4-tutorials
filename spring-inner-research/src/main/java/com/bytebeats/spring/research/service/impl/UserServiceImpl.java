package com.bytebeats.spring.research.service.impl;

import com.bytebeats.spring.research.dao.UserDao;
import com.bytebeats.spring.research.model.User;
import com.bytebeats.spring.research.service.UserService;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @date 2017-03-02 18:11
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        int update = userDao.insert(user);
        return update>0;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
