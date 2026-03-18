package com.example.demo.service;

import com.example.demo.domain.HelloMessage;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello() {
        return "Hello from Spring Boot!";
    }

    public String respondTo(HelloMessage message) {
        return "Hello, " + message.getName() + "!";
    }
}
