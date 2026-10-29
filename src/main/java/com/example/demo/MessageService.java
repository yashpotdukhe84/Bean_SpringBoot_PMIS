
package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public String displayMessage() {
        return messageRepository.getMessage();
    }
}
