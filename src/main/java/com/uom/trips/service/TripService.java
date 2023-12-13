package com.uom.trips.service;

import java.util.*;
import com.uom.trips.com.uom.trips.model.Trip;
import com.uom.trips.tripsrepository.TripsRepository;

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
	
	public Optional<Trip> getTripsByArrivalLocation(Trip t) throws Exception{
		return tripsRepository.findByArrivalLocation(t.getArrivalLocation());
	}

	
}
