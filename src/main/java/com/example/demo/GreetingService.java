
package com.example.demo;

import org.springframework.stereotype.Service;

@Service 
public class GreetingService {

    public String greet() {
        return "Hello Yash! Welcome to Spring Boot.";
    }
}
