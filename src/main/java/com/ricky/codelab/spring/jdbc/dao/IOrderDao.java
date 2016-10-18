package com.ricky.codelab.spring.jdbc.dao;

import com.ricky.codelab.spring.domain.Order;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-10-18 23:05
 */
public interface IOrderDao {

    long insert(Order order);
    Order queryById(long id);
}
