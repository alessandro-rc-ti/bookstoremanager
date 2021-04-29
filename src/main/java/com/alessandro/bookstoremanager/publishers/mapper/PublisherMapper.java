package com.alessandro.bookstoremanager.publishers.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.alessandro.bookstoremanager.publishers.dto.PublisherDTO;
import com.alessandro.bookstoremanager.publishers.entity.Publisher;

@Mapper
public interface PublisherMapper {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    Publisher toModel(PublisherDTO publisherDTO);

    PublisherDTO toDTO(Publisher publisher);
}
