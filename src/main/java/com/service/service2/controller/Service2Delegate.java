package com.service.service2.controller;

import org.springframework.stereotype.Component;


@Component
public class Service2Delegate implements Service2 {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
