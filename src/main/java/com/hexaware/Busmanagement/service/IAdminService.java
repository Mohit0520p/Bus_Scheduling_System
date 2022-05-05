package com.hexaware.Busmanagement.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.Busmanagement.entity.Admin;

public interface IAdminService {
	
	public Admin addAdmin(Admin newAdmin);
	public void deleteAdmin(Long adminId);
	public Admin updateAdmin(Long adminId,Admin updateAdmin);
	public List<Admin> getAllAdmins();
	public Optional<Admin> getAdminById(Long adminId) ;

}
