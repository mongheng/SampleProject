package com.emh.supercar.model.places;

/**
 * 
 * @author monghengear
 *
 */
public class Location {
	
	private int locationid;
	private String street;
	private String state;
	private String pin;
	
	public int getLocationid() {
		return locationid;
	}

	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Location(int locationid, String street, String state, String pin) {
		super();
		this.locationid = locationid;
		this.street = street;
		this.state = state;
		this.pin = pin;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
