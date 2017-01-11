package com.bytebeats.spring4.transaction.service;

import com.bytebeats.spring4.transaction.domain.Order;
import com.bytebeats.spring4.transaction.domain.User;

/**
 * 下单服务
 *
 * @author Ricky Fung
 * @create 2017-01-12 00:24
 */
public interface OrderBookingService {

    int book(User user, Order order);
}
