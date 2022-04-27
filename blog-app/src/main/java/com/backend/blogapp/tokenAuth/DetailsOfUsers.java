package com.backend.blogapp.tokenAuth;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.backend.blogapp.classes.Users;
import com.backend.blogapp.repositories.UserRepository;

@Service
public class DetailsOfUsers implements UserDetailsService{

	@Autowired 
	private UserRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users i = repository.findByUsername(username);
		
		if (i==null) {
			throw new UsernameNotFoundException(username);
		}
		
		return new SelectedUser(i);
		
	}


	
}
