package com.bytebeats.spring4.sample;

import com.bytebeats.spring4.sample.dao.IOrderDao;
import com.bytebeats.spring4.sample.domain.Order;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IOrderDao orderDao = (IOrderDao) context.getBean("orderDao");

        Order order = new Order();
        order.setCustomerName("Ricky");
        order.setAmount(11);
        order.setTotalPrice(120.2d);
        order.setAddress("北京市");

        long id = orderDao.insert(order);
        System.out.println(id);

        List<Order> list = orderDao.queryOrders();
        System.out.println(list);
    }
}
