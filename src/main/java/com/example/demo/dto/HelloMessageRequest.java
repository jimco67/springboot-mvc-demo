package com.example.demo.dto;


import com.example.demo.domain.HelloMessage;
import lombok.Getter;

@Getter
public class HelloMessageRequest {

    private String message;


    public HelloMessage toDomain() {
        return new HelloMessage.HelloBuilder().name(this.message).build();
    }
}
