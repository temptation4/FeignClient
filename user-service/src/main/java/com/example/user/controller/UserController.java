package com.example.user.controller;

import com.example.user.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return new User(id, "Neelu", "neelu@example.com");
    }
}
