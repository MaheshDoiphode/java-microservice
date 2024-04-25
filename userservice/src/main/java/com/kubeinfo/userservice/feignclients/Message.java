package com.kubeinfo.userservice.feignclients;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message {
    @Id
    String userId;
    List<String> messages;
}
