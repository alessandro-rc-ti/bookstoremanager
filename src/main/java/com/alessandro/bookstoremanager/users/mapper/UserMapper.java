package com.alessandro.bookstoremanager.users.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.alessandro.bookstoremanager.users.dto.UserDTO;
import com.alessandro.bookstoremanager.users.entity.User;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toModel(UserDTO userDTO);

    UserDTO toDTO(User user);
}
