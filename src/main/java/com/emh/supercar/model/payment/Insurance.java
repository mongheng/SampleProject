package com.emh.supercar.model.payment;

import java.util.Date;

import com.emh.supercar.model.vehicle.Car;

/**
 * 
 * @author monghengear
 *
 */
public class Insurance {

	private int insuranceid;
	private Car car; //many to one.
	private String insurance_company;
	private double amount;
	private Date renewdate;
	private int version;
	private InsuranceType insurancetype;
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Insurance(int insuranceid, Car car, String insurance_company, double amount, Date renewdate, int version,
			InsuranceType insurancetype) {
		super();
		this.insuranceid = insuranceid;
		this.car = car;
		this.insurance_company = insurance_company;
		this.amount = amount;
		this.renewdate = renewdate;
		this.version = version;
		this.insurancetype = insurancetype;
	}

	public int getInsuranceid() {
		return insuranceid;
	}

	public void setInsuranceid(int insuranceid) {
		this.insuranceid = insuranceid;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getInsurance_company() {
		return insurance_company;
	}

	public void setInsurance_company(String insurance_company) {
		this.insurance_company = insurance_company;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getRenewdate() {
		return renewdate;
	}

	public void setRenewdate(Date renewdate) {
		this.renewdate = renewdate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public InsuranceType getInsurancetype() {
		return insurancetype;
	}

	public void setInsurancetype(InsuranceType insurancetype) {
		this.insurancetype = insurancetype;
	}
	
}
