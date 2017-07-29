package com.bytebeats.spring4.ioc.domain;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-19 17:42
 */
public class Employee {
    private long id;
    private String name;
    private int age;

    public Employee(){

    }
    public Employee(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
