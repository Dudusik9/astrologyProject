package com.dud.and.kra.astrology.converters;

import com.dud.and.kra.astrology.dto.UserDTO;
import com.dud.and.kra.astrology.models.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserToUserDtoConverter implements Converter<User, UserDTO> {
    @Override
    public UserDTO convert(User source) {
        return UserDTO.builder()
            .id(source.getId())
            .firstName(source.getFirstName())
            .secondName(source.getSecondName())
            .email(source.getEmail())
            .birthday(source.getBirthday())
            .build();
    }
}
