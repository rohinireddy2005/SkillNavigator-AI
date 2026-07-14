package com.skillnavigator.service;

import java.util.List;   // <-- ADD THIS

import com.skillnavigator.dto.UserDto;
import com.skillnavigator.entity.User;

public interface UserService {

    User register(UserDto userDto);

    User login(String email, String password);

    List<User> getAllUsers();   // uses List
    User getUserById(Long id);
}