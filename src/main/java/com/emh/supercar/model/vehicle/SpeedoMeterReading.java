package com.emh.supercar.model.vehicle;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author monghengear
 *
 */

@Entity
@Table(name = "SPEEDOMETERREADING")
public class SpeedoMeterReading {
	
	private int speedometerid;
	private Date readingdate;
	private Date readingtime;
	private int reading;
	private int version;
	private Car car;
	
	public SpeedoMeterReading() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpeedoMeterReading(int speedometerid, Date readingdate, Date readingtime, int reading, int version,
			Car car) {
		super();
		this.speedometerid = speedometerid;
		this.readingdate = readingdate;
		this.readingtime = readingtime;
		this.reading = reading;
		this.version = version;
		this.car = car;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SPEEDOMETER_ID")
	public int getSpeedometerid() {
		return speedometerid;
	}

	public void setSpeedometerid(int speedometerid) {
		this.speedometerid = speedometerid;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "READINGDATE")
	public Date getReadingdate() {
		return readingdate;
	}

	public void setReadingdate(Date readingdate) {
		this.readingdate = readingdate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "READINGTIME")
	public Date getReadingtime() {
		return readingtime;
	}

	public void setReadingtime(Date readingtime) {
		this.readingtime = readingtime;
	}

	public int getReading() {
		return reading;
	}

	public void setReading(int reading) {
		this.reading = reading;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CAR_ID")
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
}
