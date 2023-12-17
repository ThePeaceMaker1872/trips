package com.uom.trips.service;

import java.util.*;

import com.uom.trips.model.Trip;
import com.uom.trips.repository.TripRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TripService {
	
	@Autowired
	private TripRepository tripRepository;
	
	public List<Trip> getAllTrips() throws Exception{
		return tripRepository.findAll();
		
	}
	
	public void addTrip(Trip t) throws Exception {
		tripRepository.save(t);
	}
	
	public Optional<Trip> getTripById(Trip t) throws Exception{
		return tripRepository.findById(t.getTravelId());
	}
	
	public Trip getTripById(int id) throws Exception{
		return tripRepository.findById(id).get(); 
	}
	
	public Optional<Trip> getTripsByArrivalLocation(Trip t) throws Exception{
		return tripRepository.findByArrivalLocation(t.getArrivalLocation());
	}
	

	
}
