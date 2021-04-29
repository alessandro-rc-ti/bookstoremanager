package com.alessandro.bookstoremanager.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandro.bookstoremanager.users.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailOrUsername(String email, String username);

    Optional<User> findByUsername(String username);
}
