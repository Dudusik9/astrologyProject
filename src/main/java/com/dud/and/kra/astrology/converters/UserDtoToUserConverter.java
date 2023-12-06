package com.dud.and.kra.astrology.converters;

import com.dud.and.kra.astrology.dto.UserDTO;
import com.dud.and.kra.astrology.models.User;
import org.springframework.core.convert.converter.Converter;

public class UserDtoToUserConverter implements Converter<UserDTO, User> {
    @Override
    public User convert(UserDTO source) {
        User user = new User();
        user.setId(source.getId());
        user.setLogin(source.getLogin());
        user.setFirstName(source.getFirstName());
        user.setSecondName(source.getSecondName());
        user.setEmail(source.getEmail());
        user.setBirthday(source.getBirthday());
        return user;
    }
}
