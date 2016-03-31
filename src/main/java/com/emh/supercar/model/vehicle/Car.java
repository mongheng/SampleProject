package com.emh.supercar.model.vehicle;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.emh.supercar.model.places.Branch;

/**
 * 
 * @author monghengear
 *
 */

@Entity
@Table(name = "CAR")
public class Car {

	private int carid;
	private String carname;
	private String regnumber;
	private Date dateofadded;
	private Date modelyear;
	//private CarType cartype;
	//private FualType fualtype;
	private byte availabilityflag;
	
	//private Branch branch;
	
	//private Set<FualReading> fualReadings;
	//private Set<SpeedoMeterReading> speedoMeterReadings;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public Car(int carid, String carname, String reg_number, Date dateofadded, Date modelyear, CarType cartype,
			FualType fualtype, byte availability_flag, Branch branch) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.reg_number = reg_number;
		this.dateofadded = dateofadded;
		this.modelyear = modelyear;
		this.cartype = cartype;
		this.fualtype = fualtype;
		this.availability_flag = availability_flag;
		this.branch = branch;
	}*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAR_ID")
	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	@Column(name = "CARNAME")
	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	@Column(name = "REGNUMBER")
	public String getRegnumber() {
		return regnumber;
	}

	public void setRegnumber(String regnumber) {
		this.regnumber = regnumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATEOFADD")
	public Date getDateofadded() {
		return dateofadded;
	}

	public void setDateofadded(Date dateofadded) {
		this.dateofadded = dateofadded;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODELYEAR")
	public Date getModelyear() {
		return modelyear;
	}

	public void setModelyear(Date modelyear) {
		this.modelyear = modelyear;
	}

	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CARTYPE_ID")
	public CarType getCartype() {
		return cartype;
	}

	public void setCartype(CarType cartype) {
		this.cartype = cartype;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "FUALTYPE_ID")
	public FualType getFualtype() {
		return fualtype;
	}

	public void setFualtype(FualType fualtype) {
		this.fualtype = fualtype;
	}*/

	@Column(name = "AVAILABILITY_FLAG")
	public byte getAvailability_flag() {
		return availabilityflag;
	}

	public void setAvailability_flag(byte availabilityflag) {
		this.availabilityflag = availabilityflag;
	}

	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BRANCH_ID")
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	public Set<FualReading> getFualReadings() {
		return fualReadings;
	}

	public void setFualReadings(Set<FualReading> fualReadings) {
		this.fualReadings = fualReadings;
	}

	@OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	public Set<SpeedoMeterReading> getSpeedoMeterReadings() {
		return speedoMeterReadings;
	}

	public void setSpeedoMeterReadings(Set<SpeedoMeterReading> speedoMeterReadings) {
		this.speedoMeterReadings = speedoMeterReadings;
	}
*/		
}
