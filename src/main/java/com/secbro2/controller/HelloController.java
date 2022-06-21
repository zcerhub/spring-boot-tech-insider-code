package com.secbro2.controller;


import com.zchuber.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private MsgService msgService;

    @GetMapping("/hello")
    public String sendMsg(){
        return "world";
    }

}
