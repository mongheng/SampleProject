package com.emh.supercar.model.transaction;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.emh.supercar.model.vehicle.Car;

/**
 * 
 * @author earmongheng
 *
 */

@Entity
@Table(name = "CARFORSALERECORD")
public class CarForSaleRecord {

	private int carforsaleid;
	private Date dateofadded;
	private String branchlocation;
	private Double saleprice;
	private int speedoreading;
	private Car car;
	
	public CarForSaleRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CarForSaleRecord(int carforsaleid, Date dateofadded, String branchlocation, Double saleprice,
			int speedoreading, Car car) {
		super();
		this.carforsaleid = carforsaleid;
		this.dateofadded = dateofadded;
		this.branchlocation = branchlocation;
		this.saleprice = saleprice;
		this.speedoreading = speedoreading;
		this.car = car;
	}

	@Id
	@GeneratedValue()
	@Column(name = "CARFORSALE_ID")
	public int getCarforsaleid() {
		return carforsaleid;
	}
	public void setCarforsaleid(int carforsaleid) {
		this.carforsaleid = carforsaleid;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATEOFADDED")
	public Date getDateofadded() {
		return dateofadded;
	}
	public void setDateofadded(Date dateofadded) {
		this.dateofadded = dateofadded;
	}
	
	@Column(name = "BRANCHLOCATION")
	public String getBranchlocation() {
		return branchlocation;
	}
	public void setBranchlocation(String branchlocation) {
		this.branchlocation = branchlocation;
	}
	
	@Column(name = "SALEPRICE")
	public Double getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(Double saleprice) {
		this.saleprice = saleprice;
	}
	
	@Column(name = "SPEEDOREADING")
	public int getSpeedoreading() {
		return speedoreading;
	}
	public void setSpeedoreading(int speedoreading) {
		this.speedoreading = speedoreading;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CAR_ID")
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
}
