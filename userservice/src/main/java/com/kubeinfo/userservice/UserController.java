package com.kubeinfo.userservice;


import com.kubeinfo.userservice.feignclients.Message;
import com.kubeinfo.userservice.feignclients.MessageServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private MessageServiceClient messageServiceClient;

    @GetMapping("getall")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> ls = userService.getAllUsers();
        return ResponseEntity.ok(ls);
    }

    @GetMapping("{userId}/messages")
    public ResponseEntity<Message> getMessages(@PathVariable String userId) {
        return ResponseEntity.ok(messageServiceClient.getMessages(userId));
    }
}
