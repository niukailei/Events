package com.application;


import com.application.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {

    @Autowired
    private User u;
    @RequestMapping("/get")
    public void testPro(){

    }
}
