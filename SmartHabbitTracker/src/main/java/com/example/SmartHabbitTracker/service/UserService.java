package com.example.SmartHabbitTracker.service;

import com.example.SmartHabbitTracker.model.User;
import com.example.SmartHabbitTracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email already taken!");
        }
        return userRepository.save(user);
    }
}