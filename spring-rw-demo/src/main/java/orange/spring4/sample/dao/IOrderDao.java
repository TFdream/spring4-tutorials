package orange.spring4.sample.dao;

import orange.spring4.sample.domain.Order;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-12-30 11:15
 */
public interface IOrderDao {

    long insert(Order order);

    List<Order> queryOrders();
}
