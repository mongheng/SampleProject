package com.emh.supercar.model.transaction;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.emh.supercar.model.places.Location;
import com.emh.supercar.model.usermodel.User;
import com.emh.supercar.model.vehicle.Car;

/**
 * 
 * @author monghengear
 *
 */
public class BookingRecord {

	private int bookingid;
	private Location source;
	private Location destrination;
	private User user;
	private Car car;
	private Timesheet timesheet;
	private Date dateofjourny;
	private int distance;
	private int numberofpassenger;
	private byte driver_flag;
	private byte comfirm_flag;
	
	public BookingRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookingRecord(int bookingid, Location source, Location destrination, User user, Car car, Timesheet timesheet,
			Date dateofjourny, int distance, int numberofpassenger, byte driver_flag, byte comfirm_flag) {
		super();
		this.bookingid = bookingid;
		this.source = source;
		this.destrination = destrination;
		this.user = user;
		this.car = car;
		this.timesheet = timesheet;
		this.dateofjourny = dateofjourny;
		this.distance = distance;
		this.numberofpassenger = numberofpassenger;
		this.driver_flag = driver_flag;
		this.comfirm_flag = comfirm_flag;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOKING_ID")
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Location getSource() {
		return source;
	}
	public void setSource(Location source) {
		this.source = source;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Location getDestrination() {
		return destrination;
	}
	public void setDestrination(Location destrination) {
		this.destrination = destrination;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Timesheet getTimesheet() {
		return timesheet;
	}
	public void setTimesheet(Timesheet timesheet) {
		this.timesheet = timesheet;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATEOFJOURNY")
	public Date getDateofjourny() {
		return dateofjourny;
	}
	public void setDateofjourny(Date dateofjourny) {
		this.dateofjourny = dateofjourny;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getNumberofpassenger() {
		return numberofpassenger;
	}
	public void setNumberofpassenger(int numberofpassenger) {
		this.numberofpassenger = numberofpassenger;
	}
	public byte getDriver_flag() {
		return driver_flag;
	}
	public void setDriver_flag(byte driver_flag) {
		this.driver_flag = driver_flag;
	}
	public byte getComfirm_flag() {
		return comfirm_flag;
	}
	public void setComfirm_flag(byte comfirm_flag) {
		this.comfirm_flag = comfirm_flag;
	}
}
