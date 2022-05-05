package com.hexaware.Busmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.Busmanagement.entity.User;
import com.hexaware.Busmanagement.repository.UserRepository;

@Service
public class IUserServiceImpl implements IUserService {
	
	
	@Autowired
	public UserRepository restUser;

	@Override
	public User addUser(User newUser) {
		// TODO Auto-generated method stub
		return restUser.save (newUser);
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		restUser.deleteById(userId);
		
	}

	@Override
	public User updateUser(Long userId, User updateUser) {
		// TODO Auto-generated method stub
		Optional<User> user = restUser.findById(userId);
		User rest = null;
		if(user.isPresent()) {
			rest = user.get();
			rest.setUserName(updateUser.getUserName());
			rest.setUserAddress(updateUser.getUserAddress());
			rest.setUserEmail(updateUser.getUserEmail());
			restUser.save(rest);
		}
		return rest;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return restUser.findAll();
	}

	@Override
	public Optional<User> getUserById(Long userId) {
		// TODO Auto-generated method stub
		return  restUser.findById(userId);
	}

}
