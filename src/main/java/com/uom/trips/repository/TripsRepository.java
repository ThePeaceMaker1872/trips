package com.uom.trips.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uom.trips.com.uom.trips.model.Trip;

public interface TripsRepository extends JpaRepository<Trip, Integer>{
	
	Optional<Trip> findByArrivalLocation(String arrivalLocation);
}
