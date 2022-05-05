package com.hexaware.Busmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.Busmanagement.entity.Bus;

import com.hexaware.Busmanagement.repository.BusRepository;



@Service
public class IBusServiceImpl implements IBusService {

	@Autowired
	public BusRepository restBus;

	@Override
	public Bus addBus(Bus newBus) {
		// TODO Auto-generated method stub
		return restBus.save(newBus);
	}

	@Override
	public void deleteBus(Long busId) {
		// TODO Auto-generated method stub
		restBus.deleteById(busId);
	}

	@Override
	public Bus updateBus(Long busId, Bus updateBus) {
		// TODO Auto-generated method stub
		Optional<Bus> bus = restBus.findById(busId);
		Bus rest = null;
		if(bus.isPresent()) {
			rest = bus.get();
			rest.setBusCapacity(updateBus.getBusCapacity());
			rest.setBusType(updateBus.getBusType());
			//rest.setUserEmail(updateUser.getUserEmail());
			restBus.save(rest);
		}
		return rest;
	}

	@Override
	public List<Bus> getAllBuses() {
		// TODO Auto-generated method stub
		return restBus.findAll();
	}

	@Override
	public Optional<Bus> getBusById(Long busId) {
		// TODO Auto-generated method stub
		return  restBus.findById(busId);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
