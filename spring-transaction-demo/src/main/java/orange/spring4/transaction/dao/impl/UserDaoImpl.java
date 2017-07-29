package orange.spring4.transaction.dao.impl;

import orange.spring4.transaction.dao.UserDao;
import orange.spring4.transaction.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-01-11 23:07
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int updateBalance(Long userId, double money) {
        return 0;
    }

}
