package com.bytebeats.spring4.transaction.domain;

/**
 * 订单项
 *
 * @author Ricky Fung
 * @create 2017-01-12 00:15
 */
public class OrderItem {
    private Long id;
    private String name;    //名称
    private double price;   //单价
    private String desc;    //商品描述
    private int quantity;  //库存数量

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
