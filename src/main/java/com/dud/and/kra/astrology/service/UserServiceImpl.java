package com.dud.and.kra.astrology.service;

import com.dud.and.kra.astrology.model.User;
import com.dud.and.kra.astrology.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(long userId) {
        return userRepository.findById(userId).orElseThrow( () -> new EntityNotFoundException("User didn't find"));
    }
}
