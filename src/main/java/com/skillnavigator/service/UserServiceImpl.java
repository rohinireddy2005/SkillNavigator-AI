package com.skillnavigator.service;

import java.util.List;          // <-- ADD THIS
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillnavigator.dto.UserDto;
import com.skillnavigator.entity.User;
import com.skillnavigator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private CloudWatchService cloudWatchService;
    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User register(UserDto dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setCollege(dto.getCollege());
        user.setBranch(dto.getBranch());
        user.setYear(dto.getYear());
        user.setPassword(dto.getPassword());

        User savedUser = repository.save(user);

        // 🔥 SEND CUSTOM METRIC TO CLOUDWATCH
        cloudWatchService.putMetric("UserRegistration", 1.0);

        return savedUser;
    }

    @Override
    public User login(String email, String password) {
        Optional<User> optional = repository.findByEmail(email);
        if (optional.isPresent()) {
            User user = optional.get();
            if (user.getPassword().equals(password))
                return user;
        }
        return null;
    }
    @Override
    public User getUserById(Long id) {
        return repository.findById(id).orElse(null);
    }
}