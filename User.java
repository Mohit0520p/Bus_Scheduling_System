package com.hexaware.Busmanagement.entity;

import javax.persistence.Entity;
//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;

//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;

@Entity
public class User {

// defining the private data members of User class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	private String userName;
	private String userAddress;
	private Date userDob ;
	private String userNumber;
	private String userEmail;
 
	
	// default constructor of User class 
	public User() {
		
		// TODO Auto-generated constructor stub
	}

// getter and setter's of all the private data members 
	public String getUserName() {
		return userName;
	}


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}


	public Date getUserDob() {
		return userDob;
	}


	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}


	public String getUserNumber() {
		return userNumber;
	}


	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	// parameterised constructor 
	
	public User( String userName, String userAddress, Date userDob, String userNumber, String userEmail) {
		super();
		//this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userDob = userDob;
		this.userNumber = userNumber;
		this.userEmail = userEmail;
	}
	

	
}
