package com.akkitech.myApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public void compile(){
        System.out.println("Compiling your code in laptop");
    }
}
