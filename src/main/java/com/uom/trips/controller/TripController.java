package com.uom.trips.controller;


import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.uom.trips.com.uom.trips.model.Trip;
import com.uom.trips.service.TripService;

import java.util.*;



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
	
	@GetMapping(path="/getTripById")
	public Optional<Trip> getTripById(@RequestBody Trip tr) throws Exception{
		return ts.getTripById(tr);
	}
	
	@GetMapping(path="/getTripsByArrivalLocation")
	public Optional<Trip> getTripByArrivalLocation(@RequestBody Trip tr) throws Exception{
		return ts.getTripsByArrivalLocation(tr);
		
		
	}
	

}
