package com.uom.trips.model;

import java.sql.Date;
import javax.persistence.*;


@Entity
@Table(name = "trips")
public class Trip {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int travelId;
	private String departureLocation;
	private String arrivalLocation;
	private Date departureDate;
	private Date arrivalDate;
	private int maxLimit;
	private int agencyId;
	
	
	//Constructors
	public Trip() {}
	
	public Trip(int travelId, String departureLocation, String arrivalLocation, Date departureDate, Date arrivalDate,
			int maxLimit, int agencyId) {
		super();
		this.travelId = travelId;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.maxLimit = maxLimit;
		this.agencyId = agencyId;
	}
	
	//Getters
	public int getTravelId() {return travelId;}
	public String getDepartureLocation() {return departureLocation;}
	public String getArrivalLocation() {return arrivalLocation;}
	public Date getDepartureDate() {return departureDate;}
	public Date getArrivalDate() {return arrivalDate;}
	public int getMaxLimit() {return maxLimit;}
	public int getAgencyId() {return agencyId;}
	
	//Setters
	public void setTravelId(int travelId) {
		this.travelId = travelId;
	}
	
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}
	
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}
	
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}
	
	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}

	

}
