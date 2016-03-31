package com.emh.supercar.model.payment;

/**
 * 
 * @author monghengear
 *
 */
public class DriverCharges {
	
	private int driverchargeid;
	private double h_c_p_day;
	private double h_c_p_night;
	private double c_p_day;
	private double c_p_night;
	private double c_p_week;
	private double c_p_month;
	private double extra_c_p_km;
	private double wait_c_p_min;
	
	public DriverCharges() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DriverCharges(int driverchargeid, double h_c_p_day, double h_c_p_night, double c_p_day, double c_p_night,
			double c_p_week, double c_p_month, double extra_c_p_km, double wait_c_p_min) {
		super();
		this.driverchargeid = driverchargeid;
		this.h_c_p_day = h_c_p_day;
		this.h_c_p_night = h_c_p_night;
		this.c_p_day = c_p_day;
		this.c_p_night = c_p_night;
		this.c_p_week = c_p_week;
		this.c_p_month = c_p_month;
		this.extra_c_p_km = extra_c_p_km;
		this.wait_c_p_min = wait_c_p_min;
	}
	public int getDriverchargeid() {
		return driverchargeid;
	}
	public void setDriverchargeid(int driverchargeid) {
		this.driverchargeid = driverchargeid;
	}
	public double getH_c_p_day() {
		return h_c_p_day;
	}
	public void setH_c_p_day(double h_c_p_day) {
		this.h_c_p_day = h_c_p_day;
	}
	public double getH_c_p_night() {
		return h_c_p_night;
	}
	public void setH_c_p_night(double h_c_p_night) {
		this.h_c_p_night = h_c_p_night;
	}
	public double getC_p_day() {
		return c_p_day;
	}
	public void setC_p_day(double c_p_day) {
		this.c_p_day = c_p_day;
	}
	public double getC_p_night() {
		return c_p_night;
	}
	public void setC_p_night(double c_p_night) {
		this.c_p_night = c_p_night;
	}
	public double getC_p_week() {
		return c_p_week;
	}
	public void setC_p_week(double c_p_week) {
		this.c_p_week = c_p_week;
	}
	public double getC_p_month() {
		return c_p_month;
	}
	public void setC_p_month(double c_p_month) {
		this.c_p_month = c_p_month;
	}
	public double getExtra_c_p_km() {
		return extra_c_p_km;
	}
	public void setExtra_c_p_km(double extra_c_p_km) {
		this.extra_c_p_km = extra_c_p_km;
	}
	public double getWait_c_p_min() {
		return wait_c_p_min;
	}
	public void setWait_c_p_min(double wait_c_p_min) {
		this.wait_c_p_min = wait_c_p_min;
	}
	
}
