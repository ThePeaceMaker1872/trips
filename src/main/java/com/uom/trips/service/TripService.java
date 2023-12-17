package com.uom.trips.service;

import java.util.*;

import com.uom.trips.model.Trip;
import com.uom.trips.repository.TripsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TripService {
	
	@Autowired
	private TripsRepository tripsRepository;
	
	public List<Trip> getAllTrips() throws Exception{
		return tripsRepository.findAll();
		
	}
	
	public void addTrip(Trip t) throws Exception {
	    tripsRepository.save(t); 
	}
	
	public Optional<Trip> getTripById(Trip t) throws Exception{
		return tripsRepository.findById(t.getTravelId());
	}
	
	public Trip getTripById(int id) throws Exception{
		return tripsRepository.findById(id).get();
	}
	
	public Optional<Trip> getTripsByArrivalLocation(Trip t) throws Exception{
		return tripsRepository.findByArrivalLocation(t.getArrivalLocation());
	}

	
}
