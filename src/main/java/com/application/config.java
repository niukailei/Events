package com.application;


import com.application.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class config {


      public User getUser(){
         return new User();
      }
}
