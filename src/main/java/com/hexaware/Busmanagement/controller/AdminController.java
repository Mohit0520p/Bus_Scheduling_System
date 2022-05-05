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

import com.hexaware.Busmanagement.entity.Admin;

import com.hexaware.Busmanagement.exception.ResourceNotFoundException;
import com.hexaware.Busmanagement.service.IAdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {

	
	@Autowired
	public IAdminService adminServ;
	
	@PostMapping("/addadmin")
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin newAdmin) {
		//return custServ.addCustomer(newCustomer);
		return new ResponseEntity<>(adminServ.addAdmin(newAdmin),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getalladmins")
	public List<Admin> getAllAdmins(){
		return adminServ.getAllAdmins();
	}
	
	@GetMapping("/getadmin/{adminId}")
	public ResponseEntity<Admin> getAdminById(@PathVariable("adminId")Long adminId) {
		
		Admin admin  = adminServ.getAdminById(adminId)
				.orElseThrow(() -> new ResourceNotFoundException("Admin not found with id:::::"+adminId));
		return ResponseEntity.ok().body(admin);
	}
	
	
	@DeleteMapping("/deleteadmin/{adminId}")
	public void deleteAdmin(@PathVariable("adminId") Long adminId) {
		adminServ.deleteAdmin(adminId);
	}
	
	
	
	@PutMapping("/updatedmin/{adminId}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable("adminId") Long adminId, @RequestBody Admin updateAdmin) {
	
		return new ResponseEntity<>(adminServ.updateAdmin(adminId, updateAdmin),HttpStatus.OK);
	}
	
	
	
	
	
}
