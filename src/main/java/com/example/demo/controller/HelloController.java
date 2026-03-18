package com.example.demo.controller;

import com.example.demo.dto.HelloMessageRequest;
import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String getHello() {
        return helloService.sayHello();
    }

    @PostMapping
    public String postHello(@RequestBody HelloMessageRequest message) {
        return helloService.respondTo(message.toDomain());
    }
}
