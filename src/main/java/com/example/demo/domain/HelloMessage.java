package com.example.demo.domain;


public class HelloMessage {
    private final String name;

    private HelloMessage(HelloBuilder helloBuilder) {
        this.name = helloBuilder.name;
    }

    public String getName() {
        return name;
    }

    public static class HelloBuilder {
        private String name;

        public HelloBuilder name(String name) {
            this.name = name;
            return this;
        }

        public HelloMessage build() {
            return new HelloMessage(this);
        }
    }
}
