package com.emh.supercar.model.payment;

import java.util.Date;

public class Coupon {

	private int couponid;
	private double min_amount;
	private double max_amount;
	private double dis_amount;
	private Date valid_upto;
	
	public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coupon(int couponid, double min_amount, double max_amount, double dis_amount, Date valid_upto) {
		super();
		this.couponid = couponid;
		this.min_amount = min_amount;
		this.max_amount = max_amount;
		this.dis_amount = dis_amount;
		this.valid_upto = valid_upto;
	}

	public int getCouponid() {
		return couponid;
	}

	public void setCouponid(int couponid) {
		this.couponid = couponid;
	}

	public double getMin_amount() {
		return min_amount;
	}

	public void setMin_amount(double min_amount) {
		this.min_amount = min_amount;
	}

	public double getMax_amount() {
		return max_amount;
	}

	public void setMax_amount(double max_amount) {
		this.max_amount = max_amount;
	}

	public double getDis_amount() {
		return dis_amount;
	}

	public void setDis_amount(double dis_amount) {
		this.dis_amount = dis_amount;
	}

	public Date getValid_upto() {
		return valid_upto;
	}

	public void setValid_upto(Date valid_upto) {
		this.valid_upto = valid_upto;
	}
	
}
