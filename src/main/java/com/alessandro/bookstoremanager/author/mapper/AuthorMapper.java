package com.alessandro.bookstoremanager.author.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.alessandro.bookstoremanager.author.dto.AuthorDTO;
import com.alessandro.bookstoremanager.author.entity.Author;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDTO(Author author);
}
