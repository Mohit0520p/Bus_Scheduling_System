package com.hexaware.Busmanagement.controller;

import java.util.List;

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

import com.hexaware.Busmanagement.entity.Bus;

import com.hexaware.Busmanagement.exception.ResourceNotFoundException;
import com.hexaware.Busmanagement.service.IBusService;


@RestController
@RequestMapping("/bus")
public class BusController {

	@Autowired
	public IBusService busServ;
	
	
	@PostMapping("/addbus")
	public ResponseEntity<Bus> addBus(@RequestBody Bus newBus) {
		//return custServ.addCustomer(newCustomer);
		return new ResponseEntity<>(busServ.addBus(newBus),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getallbuses")
	public List<Bus> getAllBuses(){
		return busServ.getAllBuses();
	}
	
	@GetMapping("/getbus/{busId}")
	public ResponseEntity<Bus> getBusById(@PathVariable("busId")Long busId) {
		
		Bus bus  = busServ.getBusById(busId)
				.orElseThrow(() -> new ResourceNotFoundException("Bus not found with id:::::"+busId));
		return ResponseEntity.ok().body(bus);
	}
	
	
	@DeleteMapping("/deletebus/{busId}")
	public void deleteBus(@PathVariable("busId") Long busId) {
		busServ.deleteBus(busId);
	}
	
	
	
	@PutMapping("/updatebus/{busId}")
	public ResponseEntity<Bus> updateBus(@PathVariable("busId") Long busId, @RequestBody Bus updateBus) {
	
		return new ResponseEntity<>(busServ.updateBus(busId, updateBus),HttpStatus.OK);
	}
		
}
