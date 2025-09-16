package com.example.department.controller;
import com.example.department.client.UserClient;
import com.example.department.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final UserClient userClient;

    public DepartmentController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/{deptId}/user/{userId}")
    public String getDepartmentWithUser(@PathVariable Long deptId, @PathVariable Long userId) {
        User user = userClient.getUserById(userId);
        return "Department: " + deptId + ", User: " + user.getName();
    }
}
