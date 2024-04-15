package com.kubeinfo.messageservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/user/{userId}")
    public Message getMessages(@PathVariable String userId){
        return messageRepository.findById(userId).orElse(null);
    }
}
