package com.backend.blogapp.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.jwt;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

import com.backend.blogapp.classes.Users;
import com.backend.blogapp.repositories.UserRepository;

@WebMvcTest

class UserControllerTest {

	/*
	@MockBean
	private UserRepository repository;
	
	@Autowired
	private WebApplicationContext context;
	
	@Autowired 
	private MockMvc mock;
	
	@Test
	void allUsers() throws Exception {
		when(repository.findAll()).thenReturn(List.of(new Users(0,"test","test")));
		
		this.mock.perform(MockMvcRequestBuilders.get("/api/users").with(jwt()))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	*/
}
