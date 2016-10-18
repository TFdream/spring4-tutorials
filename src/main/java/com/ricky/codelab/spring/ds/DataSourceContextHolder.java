package com.ricky.codelab.spring.ds;

import org.springframework.util.Assert;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-10-18 22:44
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<RouteStrategy> contextHolder =
            new ThreadLocal<RouteStrategy>();

    public static void setRouteStrategy(RouteStrategy customerType) {
        Assert.notNull(customerType, "customerType cannot be null");
        contextHolder.set(customerType);
    }

    public static RouteStrategy getRouteStrategy() {
        return (RouteStrategy) contextHolder.get();
    }

    public static void clearRouteStrategy() {
        contextHolder.remove();
    }
}
