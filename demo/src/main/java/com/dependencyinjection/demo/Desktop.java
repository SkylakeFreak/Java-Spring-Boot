package com.dependencyinjection.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compiling with 404 errors desktop");
    }
}

