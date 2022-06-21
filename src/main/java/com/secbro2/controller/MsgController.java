package com.secbro2.controller;


import com.zchuber.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

    @Autowired
    private MsgService msgService;

    @GetMapping("/sendMsg")
    public String sendMsg(){
        msgService.sendMsg("测试消息");
        return "ok";
    }

}
