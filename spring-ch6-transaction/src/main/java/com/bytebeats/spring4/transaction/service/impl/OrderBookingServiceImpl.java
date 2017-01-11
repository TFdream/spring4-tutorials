package com.bytebeats.spring4.transaction.service.impl;

import com.bytebeats.spring4.transaction.domain.Order;
import com.bytebeats.spring4.transaction.domain.User;
import com.bytebeats.spring4.transaction.service.OrderBookingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-01-12 00:27
 */
@Service("orderBookingService")
public class OrderBookingServiceImpl implements OrderBookingService {

    @Transactional(rollbackFor = {SQLException.class})
    @Override
    public int book(User user, Order order) {
        return 0;
    }
}
