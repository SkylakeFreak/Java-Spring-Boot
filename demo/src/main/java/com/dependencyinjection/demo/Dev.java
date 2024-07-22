package com.dependencyinjection.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired//feild injection
    @Qualifier("laptop")
    private Computer computer;
//    public Dev(Compute compute){
//        this.compute=compute;
//    }//constructor injection

//    @Autowired
//    public void setCompute(Compute compute){
//        this.compute=compute;
//    }
    //setter injection
    public void build(){
        computer.compile();
        System.out.println("Working on awesome project");
    }
}
