package com.bytebeats.spring4.extension.domain;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-11-23 14:21
 */
public class RpcProtocolBean {
    private String id;
    private String name;
    private String host;
    private int port;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
