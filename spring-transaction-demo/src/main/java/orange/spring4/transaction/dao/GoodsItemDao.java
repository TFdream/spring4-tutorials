package orange.spring4.transaction.dao;

import orange.spring4.transaction.domain.OrderItem;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-01-12 00:17
 */
public interface GoodsItemDao {

    int insert(OrderItem item);

    int updateStock(Long pid, int amount);
}
