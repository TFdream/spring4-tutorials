package com.ricky.codelab.spring.jdbc.dao.impl;

import com.ricky.codelab.spring.domain.Order;
import com.ricky.codelab.spring.ds.DataSourceContextHolder;
import com.ricky.codelab.spring.ds.RouteStrategy;
import com.ricky.codelab.spring.jdbc.dao.IOrderDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-10-18 23:06
 */
public class OrderDaoImpl implements IOrderDao {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public long insert(Order order) {

        return 0;
    }

    @Override
    public Order queryById(long id) {
        DataSourceContextHolder.setRouteStrategy(new RouteStrategy(true, "slave1"));
        List<Order> list = jdbcTemplate.query("", new Object[]{}, new RowMapper<Order>() {
            @Override
            public Order mapRow(ResultSet rs, int i) throws SQLException {
                return null;
            }
        });

        return list!=null && list.size()>0 ? list.get(0):null;
    }
}
