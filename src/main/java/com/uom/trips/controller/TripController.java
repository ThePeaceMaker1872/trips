package com.uom.trips.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uom.trips.com.uom.trips.model.Trip;
import com.uom.trips.service.TripService;

import java.util.*;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TripController {
	
	@Autowired
	private TripService ts;
	
	@GetMapping(path="/trips")
	public List<Trip> getAllTrips() throws Exception{
		return ts.getAllTrips();
	}
	
	@PostMapping(path="/addTrip")
	public void addTrip(@RequestBody Trip tr) throws Exception{
		ts.addTrip(tr);
	}
	
	

}
