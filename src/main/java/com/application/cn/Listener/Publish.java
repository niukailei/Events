package com.application.cn.Listener;


import com.application.cn.huishan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


/**
 * 发布类
 */
@Component
public class Publish {

    @Autowired
    ApplicationContext context;

    public void published() {

        huishan h=new huishan(this,"凯雷","回山",27);
        System.out.println("发部event："+h);
        context.publishEvent(h);
    }
}
