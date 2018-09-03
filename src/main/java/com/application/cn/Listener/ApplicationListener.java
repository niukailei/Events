package com.application.cn.Listener;

import com.application.cn.huishan;
import org.springframework.stereotype.Component;


@Component
public class ApplicationListener  implements org.springframework.context.ApplicationListener<huishan> {


    @Override
    public void onApplicationEvent(huishan huishan) {
        String address = huishan.getAddress();
        System.out.println("监听到了消息"+address);
    }

}
