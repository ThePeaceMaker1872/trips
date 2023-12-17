package com.uom.trips.controller;


import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.uom.trips.model.Trip;
import com.uom.trips.service.TripService;

import java.util.*;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TripController {
	
	@Autowired
	private TripService tripService;
	
	@GetMapping(path="/trips")
	public List<Trip> getAllTrips() throws Exception{
		return tripService.getAllTrips();
	}
	
	@PostMapping(path="/addTrip")
	public void addTrip(@RequestBody Trip trip) throws Exception{
		tripService.addTrip(trip);
	}
	
	@GetMapping(path="/getTripById")
	public Optional<Trip> getTripById(@RequestBody Trip trip) throws Exception{
		return tripService.getTripById(trip);
	}
	
	@GetMapping(path="/getTripsByArrivalLocation")
	public Optional<Trip> getTripByArrivalLocation(@RequestBody Trip trip) throws Exception{
		return tripService.getTripsByArrivalLocation(trip);
		
		
	}
	

}
