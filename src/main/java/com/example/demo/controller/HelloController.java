package com.example.demo.controller;

import com.example.demo.model.HelloMessage;
import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    public HelloService helloService;

    @GetMapping
    public String getHello() {
        return helloService.sayHello();
    }

    @PostMapping
    public String postHello(@RequestBody HelloMessage message) {
        return helloService.respondTo(message);
    }
}
