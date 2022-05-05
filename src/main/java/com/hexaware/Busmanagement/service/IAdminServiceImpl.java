package com.hexaware.Busmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.Busmanagement.entity.Admin;

import com.hexaware.Busmanagement.repository.AdminRepository;


@Service
public class IAdminServiceImpl implements IAdminService {

	@Autowired
	public AdminRepository restAdmin;
	
	
	@Override
	public Admin addAdmin(Admin newAdmin) {
		// TODO Auto-generated method stub
		return restAdmin.save (newAdmin);
	}

	@Override
	public void deleteAdmin(Long adminId) {
		// TODO Auto-generated method stub
		restAdmin.deleteById(adminId);
	}

	@Override
	public Admin updateAdmin(Long adminId, Admin updateAdmin) {
		Optional<Admin> admin= restAdmin.findById(adminId);
		Admin rest = null;
		if(admin.isPresent()) {
			rest = admin.get();
			rest.setAdminName(updateAdmin.getAdminName());
			rest.setAdminAddress(updateAdmin.getAdminAddress());
			rest.setAdminEmail(updateAdmin.getAdminEmail());
			restAdmin.save(rest);
		}
		return rest;
		
		
	}

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return restAdmin.findAll();
	}

	@Override
	public Optional<Admin> getAdminById(Long adminId) {
		// TODO Auto-generated method stub
		return restAdmin.findById(adminId);
	}

}
