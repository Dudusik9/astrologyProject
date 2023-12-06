package com.dud.and.kra.astrology.services;

import com.dud.and.kra.astrology.dto.UserDTO;
import com.dud.and.kra.astrology.models.User;
import com.dud.and.kra.astrology.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final ConversionService conversionService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ConversionService conversionService) {
        this.userRepository = userRepository;
        this.conversionService = conversionService;
    }

    @Override
    public UserDTO getUserById(long userId) {
        User user = userRepository.findById(userId)
            .orElseThrow( () -> new EntityNotFoundException("User didn't find"));
        return conversionService.convert(user, UserDTO.class);
    }
}
