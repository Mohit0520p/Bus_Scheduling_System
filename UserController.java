package com.hexaware.Busmanagement.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.hexaware.Busmanagement.entity.Admin;
import com.hexaware.Busmanagement.entity.User;
import com.hexaware.Busmanagement.exception.ResourceNotFoundException;
//import com.hexaware.Busmanagement.service.IAdminService;
import com.hexaware.Busmanagement.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {


	@Autowired
	public IUserService userServ;
	
	@PostMapping("/adduser")
	public ResponseEntity<User> addCustomer(@RequestBody User newUser) {
		//return custServ.addCustomer(newCustomer);
		return new ResponseEntity<>(userServ.addUser(newUser),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getallusers")
	public List<User> getAllUsers(){
		return userServ.getAllUsers();
	}
	
	@GetMapping("/getuser/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable("userId")Long userId) {
		
		User user  = userServ.getUserById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found with id:::::"+userId));
		return ResponseEntity.ok().body(user);
	}
	
	
	@DeleteMapping("/deleteuser/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		userServ.deleteUser(userId);
	}
	
	
	
	@PutMapping("/updateuser/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable("userId") Long userId, @RequestBody User updateUser) {
	
		return new ResponseEntity<>(userServ.updateUser(userId, updateUser),HttpStatus.OK);
	}
	
	
	
}
