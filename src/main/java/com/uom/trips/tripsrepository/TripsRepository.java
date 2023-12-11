package com.uom.trips.tripsrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uom.trips.com.uom.trips.model.Trip;

public interface TripsRepository extends JpaRepository<Trip, Long>{

}
