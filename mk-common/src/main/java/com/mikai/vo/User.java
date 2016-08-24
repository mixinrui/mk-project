package com.mikai.vo;

/**
 * Created by mk on 16/8/24.
 */
public class User {

    private String name;
    private Integer order;

    public User(String name, Integer order){
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
