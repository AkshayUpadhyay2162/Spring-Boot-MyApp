package com.akkitech.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile(){
        System.out.println("Compiling your code in desktop");
    }
}
