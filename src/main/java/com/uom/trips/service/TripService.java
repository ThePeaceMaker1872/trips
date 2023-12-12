package com.uom.trips.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uom.trips.com.uom.trips.model.Trip;
import com.uom.trips.tripsrepository.TripsRepository;
import java.util.List;
import java.util.Optional;
import java.util.*;


@Service
public class TripService {
	
	@Autowired
	private TripsRepository tripsRepository;
	
	public List<Trip> getAllTrips() throws Exception{
		return tripsRepository.findAll();
		
	}
	
	public void addTrip(Trip t) throws Exception {
	    // Assuming that if travelId is 0, it's a new trip to be added
	    if (t.getTravelId() == 0 || !tripsRepository.existsById(t.getTravelId())) {
	        tripsRepository.save(t);
	    } else {
	        // Handle the case when a trip with the same ID already exists
	        throw new Exception("Trip with ID " + t.getTravelId() + " already exists.");
	    }
	}
}
