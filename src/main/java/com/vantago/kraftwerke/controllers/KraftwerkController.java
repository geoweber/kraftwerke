package com.vantago.kraftwerke.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class KraftwerkController {

    public String sayHello() {
        System.out.println("Hello Welt!!!");
        return "Hi";
    }
}
