package com.alessandro.bookstoremanager.publishers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandro.bookstoremanager.publishers.entity.Publisher;

import java.util.Optional;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    Optional<Publisher> findByNameOrCode(String name, String code);
}
