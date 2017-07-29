package orange.spring4.transaction.dao;

import orange.spring4.transaction.domain.Order;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-01-12 00:09
 */
public interface OrderDao {

    int insert(Order order);
}
