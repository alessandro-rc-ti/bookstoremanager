package com.alessandro.bookstoremanager.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandro.bookstoremanager.books.entity.Book;
import com.alessandro.bookstoremanager.users.entity.User;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByNameAndIsbnAndUser(String name, String isbn, User user);

    Optional<Book> findByIdAndUser(Long id, User user);

    List<Book> findAllByUser(User user);

    void deleteByIdAndUser(Long id, User user);
}
