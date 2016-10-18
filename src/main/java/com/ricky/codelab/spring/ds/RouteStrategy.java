package com.ricky.codelab.spring.ds;

/**
 * 路由策略
 *
 * @author Ricky Fung
 * @create 2016-10-18 22:47
 */
public class RouteStrategy {
    private boolean write;
    private String key;

    public RouteStrategy(){}

    public RouteStrategy(boolean write, String key) {
        this.write = write;
        this.key = key;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
