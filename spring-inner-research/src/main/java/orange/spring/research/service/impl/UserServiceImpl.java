package orange.spring.research.service.impl;

import orange.spring.research.dao.UserDao;
import orange.spring.research.model.User;
import orange.spring.research.service.UserService;

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
