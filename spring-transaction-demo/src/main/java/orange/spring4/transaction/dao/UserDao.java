package orange.spring4.transaction.dao;

import orange.spring4.transaction.domain.User;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-01-11 23:05
 */
public interface UserDao {

    int insert(User user);

    int updateBalance(Long userId, double money);

}
