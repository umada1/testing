package com.backend.blogapp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.blogapp.classes.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

	Users findByUsername(String username);
}