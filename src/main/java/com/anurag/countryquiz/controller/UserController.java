package com.anurag.countryquiz.controller;

import com.anurag.countryquiz.model.Users;
import com.anurag.countryquiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody Users users) {
        userService.saveUser(users);
        return "New user added";
    }

    @GetMapping("/getall")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }
}
