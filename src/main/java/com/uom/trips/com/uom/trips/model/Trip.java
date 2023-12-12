package com.uom.trips.com.uom.trips.model;

import java.sql.Date;
import javax.persistence.*;


@Entity
@Table(name="trips")
public class Trip {
	
	//properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int travelId;
	
	@Column(name="departure_location")
	private String departureLocation;
	private String arrivalLocation;
	private Date departureDate;
	private Date arrivalDate;
	private int maxLimit;
	private int agencyId;
	
	
	//Constructors
	public Trip() {}
	
	public Trip(int id, String dl, String al, Date dd, Date ad, int maxl, int a) {
		
		travelId = id;
		departureLocation = dl;
		arrivalLocation = al;
		departureDate = dd;
		arrivalDate = ad;
		maxLimit = maxl;
		agencyId = a;
	}
	
	//Getters
	public int getTravelId() {return travelId;}
	public String getDeparturelocation() {return departureLocation;}
	public String getArrivallocation() {return arrivalLocation;}
	public Date getDeparturedate() {return departureDate;}
	public Date getArrivaldate() {return arrivalDate;}
	public int getMaxlimit() {return maxLimit;}
	public int getAgency() {return agencyId;}
	
	
	

}
