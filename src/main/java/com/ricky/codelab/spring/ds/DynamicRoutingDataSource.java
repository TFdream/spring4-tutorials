package com.ricky.codelab.spring.ds;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源切换
 *
 * @author Ricky Fung
 * @create 2016-10-18 22:41
 */
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {

        return DataSourceContextHolder.getRouteStrategy();
    }
}
