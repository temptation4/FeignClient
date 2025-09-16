package com.example.department.client;

import com.example.department.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
        //, url = "http://localhost:8081")
public interface UserClient {
    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") Long id);
}
