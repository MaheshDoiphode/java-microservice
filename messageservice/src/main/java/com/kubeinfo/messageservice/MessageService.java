package com.kubeinfo.messageservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    public MessageRepository messageRepository;

}
