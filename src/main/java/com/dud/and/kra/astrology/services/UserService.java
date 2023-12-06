package com.dud.and.kra.astrology.services;

import com.dud.and.kra.astrology.dto.UserDTO;
import com.dud.and.kra.astrology.models.User;

public interface UserService {

    UserDTO getUserById(long userId);
}

