package com.uom.trips.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uom.trips.com.uom.trips.model.Trip;
import com.uom.trips.tripsrepository.TripsRepository;
import java.util.List;



@Service
public class TripService {
	
	@Autowired
	private TripsRepository tripsRepository;
	
	public List<Trip> getAllTrips() throws Exception{
		return tripsRepository.findAll();
		
	}
}
