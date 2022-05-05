package com.hexaware.Busmanagement.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.Busmanagement.entity.User;

//import com.hexaware.Restaurantmanagement.entity.Customer;

public interface IUserService {

	
	public User addUser(User newUser);
	public void deleteUser(Long userId);
	public User updateUser(Long userId,User updateUser);
	public List<User> getAllUsers();
	public Optional<User> getUserById(Long userId) ;
	
	
	
}
