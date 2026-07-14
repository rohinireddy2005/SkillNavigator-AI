package com.skillnavigator.controller;

import java.util.List;   // <-- THIS IMPORT WAS MISSING

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.skillnavigator.dto.UserDto;
import com.skillnavigator.entity.User;
import com.skillnavigator.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody UserDto dto) {
        return service.register(dto);
    }

    @PostMapping("/login")
    public User login(@RequestParam String email,
                      @RequestParam String password) {
        return service.login(email, password);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
   
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }
}