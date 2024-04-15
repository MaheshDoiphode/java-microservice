package com.kubeinfo.userservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getall")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> ls = userService.getAllUsers();
        return ResponseEntity.ok(ls);
    }
}
