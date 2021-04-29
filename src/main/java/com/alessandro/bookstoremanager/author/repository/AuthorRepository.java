package com.alessandro.bookstoremanager.author.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandro.bookstoremanager.author.entity.Author;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    Optional<Author> findByName(String name);
}
