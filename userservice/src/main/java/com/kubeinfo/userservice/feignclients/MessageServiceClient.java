package com.kubeinfo.userservice.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MessageService")
public interface MessageServiceClient {
    @GetMapping("/messages/user/{userId}")
    Message getMessages(@PathVariable String userId);
}