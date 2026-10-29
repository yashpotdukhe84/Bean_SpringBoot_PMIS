
package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {

    public String getMessage() {
        return "Hello from MessageRepository!";
    }
}
