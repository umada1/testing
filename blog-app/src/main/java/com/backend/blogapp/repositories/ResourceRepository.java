package com.backend.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.blogapp.classes.Resources;

public interface ResourceRepository extends JpaRepository<Resources, Long> {
	
}