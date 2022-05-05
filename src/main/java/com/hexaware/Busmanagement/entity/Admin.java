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
public class Admin {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long adminId;
	
	
	private String adminName;
	private String adminAddress;
	private Date adminDob ;
	private String adminNumber;
	private String adminEmail;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminAddress() {
		return adminAddress;
	}

	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}

	public Date getAdminDob() {
		return adminDob;
	}

	public void setAdminDob(Date adminDob) {
		this.adminDob = adminDob;
	}

	public String getAdminNumber() {
		return adminNumber;
	}

	public void setAdminNumber(String adminNumber) {
		this.adminNumber = adminNumber;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public Admin(String adminName, String adminAddress, Date adminDob, String adminNumber, String adminEmail) {
		super();
		this.adminName = adminName;
		this.adminAddress = adminAddress;
		this.adminDob = adminDob;
		this.adminNumber = adminNumber;
		this.adminEmail = adminEmail;
	}
	
	
	
	
	
	
	
}
