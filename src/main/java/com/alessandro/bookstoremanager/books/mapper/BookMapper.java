package com.alessandro.bookstoremanager.books.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.alessandro.bookstoremanager.books.dto.BookRequestDTO;
import com.alessandro.bookstoremanager.books.dto.BookResponseDTO;
import com.alessandro.bookstoremanager.books.entity.Book;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookRequestDTO bookRequestDTO);

    Book toModel(BookResponseDTO bookRequestDTO);

    BookResponseDTO toDTO(Book book);
}
