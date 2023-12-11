package com.uom.trips.com.uom.trips.model;

import java.sql.Date;
import javax.persistence.*;


@Entity
@Table(name="trips")
public class Trip {
	
	//properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
	private int id;
	
	@Column(name="DepartureLocation")
	private String deparurelocation;
	
	@Column(name="ArrivalLocation")
	private String arrivallocation;
	
	@Column(name="DepartureDate")
	private Date departuredate;
	
	@Column(name="ArrivalDate")
	private Date arrivaldate;
	
	@Column(name="MaxLimit")
	private int maxlimit;
	
	@Column(name="Agency")
	private int agency;
	
	
	//Constructors
	public Trip() {}
	
	public Trip(int id, String dl, String al, Date dd, Date ad, int maxl, int a) {
		
		this.id = id;
		deparurelocation = dl;
		arrivallocation = al;
		departuredate = dd;
		arrivaldate = ad;
		maxlimit = maxl;
		agency = a;
	}
	
	//Getters
	public int getId() {return id;}
	public String getDeparurelocation() {return deparurelocation;}
	public String getArrivallocation() {return arrivallocation;}
	public Date getDeparturedate() {return departuredate;}
	public Date getArrivaldate() {return arrivaldate;}
	public int getMaxlimit() {return maxlimit;}
	public int getAgency() {return agency;}
	
	
	

}
