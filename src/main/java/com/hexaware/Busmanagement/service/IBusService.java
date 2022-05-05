package com.hexaware.Busmanagement.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.Busmanagement.entity.Bus;


public interface IBusService {


	public Bus addBus(Bus newBus);
	public void deleteBus(Long busId);
	public Bus updateBus(Long busId,Bus updateBus);
	public List<Bus> getAllBuses();
	public Optional<Bus> getBusById(Long busId) ;
	
	
	
}
