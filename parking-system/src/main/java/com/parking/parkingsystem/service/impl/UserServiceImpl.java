package com.parking.parkingsystem.service.impl;

import com.parking.parkingsystem.entity.User;
import com.parking.parkingsystem.repository.UserRepository;
import com.parking.parkingsystem.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}