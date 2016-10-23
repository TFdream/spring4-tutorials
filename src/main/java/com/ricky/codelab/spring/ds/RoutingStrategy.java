package com.ricky.codelab.spring.ds;

/**
 * 路由策略
 *
 * @author Ricky Fung
 * @create 2016-10-18 22:47
 */
public enum RoutingStrategy {
    Master(true, "master"), Slave(false, "slave");

    private boolean write;
    private String key;

    RoutingStrategy(boolean write, String key) {
        this.write = write;
        this.key = key;
    }

    public boolean isWrite() {
        return write;
    }

    public String getKey() {
        return key;
    }

}
