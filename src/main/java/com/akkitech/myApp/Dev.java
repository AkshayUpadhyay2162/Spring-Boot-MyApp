package com.akkitech.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
/* Dependency Injection are of three types:
    1.Field Injection
    2.Constructor Injection
    3.Setter Injection
    */

    @Autowired //Field Injection
    private Laptop laptop;

//    Constructor Injection
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

//    @Autowired  //Setter Injection
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){
        laptop.compile();
        System.out.println("Hello Akki, We're implementing dependency injection.");
    }
}
