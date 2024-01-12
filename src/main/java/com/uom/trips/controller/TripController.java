package com.uom.trips.controller;


import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.uom.trips.exception.ResourseNotFoundException;
import com.uom.trips.model.Trip;
import com.uom.trips.service.TripService;

import java.util.*;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TripController {
	
	@Autowired
	private TripService tripService;
	
	@GetMapping(path = "/trips")
	public List<Trip> getAllTrips() throws Exception{
		return tripService.getAllTrips();
	}
	
	@PostMapping(path = "/addTrip")
	public void addTrip(@RequestBody Trip trip) throws Exception{
		tripService.addTrip(trip);
	}
	
	/*@GetMapping(path="/getTripById")
	public Optional<Trip> getTripById(@RequestBody Trip trip) throws Exception{
		return tripService.getTripById(trip);
	}*/
	
	@GetMapping(path = "/trips/{id}")
	public Trip getTripbyId(@PathVariable ("id") int travelId) throws ResourseNotFoundException{
		return tripService.getTripById(travelId);
		
		
	}
	
	
	/*@GetMapping(path = "/trips/{id}")
	public Optional<Trip> getTripbyId(@PathVariable ("id") int travelId, @RequestBody Trip trip) throws Exception{
		return tripService.getTripById(trip);
		
	}*/
	
	/*@GetMapping(path="/getTripsByArrivalLocation")
	public Optional<Trip> getTripByArrivalLocation(@RequestBody Trip trip) throws Exception{
		return tripService.getTripsByArrivalLocation(trip);
	}*/
	
	@GetMapping(path = "/trips/arrivallocation/{arrivallocation}")
	public List<Trip> getTripsByArrivalLocation(@PathVariable ("arrivallocation") String arrivalLocation) throws Exception{
		return tripService.findTripsByArrivalLocation(arrivalLocation);
		
	}
	
	@GetMapping(path = "/trips/departurelocation/{departurelocation}")
	public List<Trip> getTripsByDepartureLocation(@PathVariable ("departurelocation") String departureLocation) throws Exception{
		return tripService.findTripsByDepartureLocation(departureLocation);
	}
	
}
