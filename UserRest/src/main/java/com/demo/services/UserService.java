package com.demo.services;

import java.util.List;
import java.util.Optional;

import com.demo.entities.User;

public interface UserService {
	
	public User createUser(User user);
	
	public List<User> getAllUsers();
	
	public Optional<User> getUserDetails(long id);
	
	public User updateUserDetails(long id, User user);
	
	public void deleteUser(long id);

}
