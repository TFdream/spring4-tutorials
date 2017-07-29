package com.bytebeats.spring4.transaction.service.impl;

import com.bytebeats.spring4.transaction.dao.GoodsItemDao;
import com.bytebeats.spring4.transaction.dao.OrderDao;
import com.bytebeats.spring4.transaction.domain.Order;
import com.bytebeats.spring4.transaction.domain.OrderItem;
import com.bytebeats.spring4.transaction.domain.User;
import com.bytebeats.spring4.transaction.exception.BookFailureException;
import com.bytebeats.spring4.transaction.service.OrderBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-03-03 10:27
 */
@Service("orderBookingService")
public class OrderBookingServiceImpl implements OrderBookingService {

    @Autowired
    private GoodsItemDao goodsItemDao;

    @Autowired
    private OrderDao orderDao;

    @Transactional(rollbackFor = {BookFailureException.class})
    @Override
    public boolean book(User user, Order order) throws BookFailureException {

        boolean success = true;
        int update;
        for (OrderItem item : order.getItems()){
            update = goodsItemDao.updateStock(item.getId(), item.getQuantity());
            if(update<1){
                success = false;
                break;
            }
        }
        if(success){    //更新库存成功
            update = orderDao.insert(order);
            if(update>0){
                return true;
            }
        }
        throw new BookFailureException("book failure");
    }
}
