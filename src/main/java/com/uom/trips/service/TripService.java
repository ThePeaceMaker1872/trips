package com.uom.trips.service;

import java.util.*;

import com.uom.trips.exception.ResourseNotFoundException;
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
	
	public void addTrip(Trip trip) throws Exception {
		tripRepository.save(trip);
	}
	
	/*public Optional<Trip> getTripById(Trip trip) throws Exception{
		return tripRepository.findById(trip.getTravelId());
	}*/
	
	public Trip getTripById(int id) throws ResourseNotFoundException{
		Optional<Trip> trip = tripRepository.findById(id);
		
		if(!trip.isPresent()) {
			throw new ResourseNotFoundException("Id not found");
		}
		
		return trip.get();
	}
	
	/*public Optional<Trip> getTripsByArrivalLocation(Trip trip) throws Exception{
		return tripRepository.findByArrivalLocation(trip.getArrivalLocation());
	}*/
	
	public List<Trip> findTripsByArrivalLocation(String arrivalLocation) throws Exception{
		return tripRepository.findByArrivalLocation(arrivalLocation);
	}
	
	public List<Trip> findTripsByDepartureLocation(String departureLocation) throws Exception{
		return tripRepository.findByDepartureLocation(departureLocation);
	}
}
