package com.bytebeats.spring.research.model;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @date 2017-03-02 18:09
 */
public class User {
    private Long id;
    private String name;
    private String password;
    private int age;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
