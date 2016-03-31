package com.emh.supercar.model.transaction;

import java.util.Date;

import com.emh.supercar.model.payment.Payment;
import com.emh.supercar.model.usermodel.User;

public class CarSellingRecord {
	
	private int carsaleid;
	private User user;
	private Payment payment;
	private Date dateofsale;
	private CarForSaleRecord carforsalerecord;
	
	public CarSellingRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CarSellingRecord(int carsaleid, User user, Payment payment, Date dateofsale,
			CarForSaleRecord carforsalerecord) {
		super();
		this.carsaleid = carsaleid;
		this.user = user;
		this.payment = payment;
		this.dateofsale = dateofsale;
		this.carforsalerecord = carforsalerecord;
	}

	public int getCarsaleid() {
		return carsaleid;
	}
	public void setCarsaleid(int carsaleid) {
		this.carsaleid = carsaleid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Date getDateofsale() {
		return dateofsale;
	}
	public void setDateofsale(Date dateofsale) {
		this.dateofsale = dateofsale;
	}
	public CarForSaleRecord getCarforsalerecord() {
		return carforsalerecord;
	}
	public void setCarforsalerecord(CarForSaleRecord carforsalerecord) {
		this.carforsalerecord = carforsalerecord;
	}
	
}
