package com.ricky.codelab.spring.dao;

import com.ricky.codelab.spring.domain.Order;
import com.ricky.codelab.spring.ds.DynamicRoutingContextHolder;
import com.ricky.codelab.spring.ds.RoutingStrategy;
import com.ricky.codelab.spring.jdbc.dao.IOrderDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-10-23 15:25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class OrderDaoTest {

    @Autowired
    private IOrderDao orderDao;

    @Test
    public void testDynamic() {

        //访问主库
        DynamicRoutingContextHolder.setRouteStrategy(RoutingStrategy.Master);
        long id = orderDao.insert(new Order());

        //访问从库
        DynamicRoutingContextHolder.setRouteStrategy(RoutingStrategy.Slave);
        List<Order> list = orderDao.queryOrders();
    }
}
