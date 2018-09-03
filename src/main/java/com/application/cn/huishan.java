package com.application.cn;

import org.springframework.context.ApplicationEvent;

public class huishan extends ApplicationEvent {

    private String name;
    private String address;
    private Integer age;
    public huishan(Object source,String name,String address,Integer age) {
        super(source);
        this.address=address;
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void get(){
        System.out.println("这是 一个spring的事件");
    }
}
