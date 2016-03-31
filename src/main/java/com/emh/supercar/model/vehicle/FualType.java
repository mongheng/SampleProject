package com.emh.supercar.model.vehicle;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author earmongheng
 *
 */

@Entity
@Table(name = "FUAL_TYPE")
public class FualType {

	private int fualtypeid;
	private String faultypename;
	private String falutypedesc;
	
	private Set<Car> cars;
	
	public FualType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FualType(int fualtypeid, String faultypename, String falutypedesc) {
		super();
		this.fualtypeid = fualtypeid;
		this.faultypename = faultypename;
		this.falutypedesc = falutypedesc;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FUALTYPE_ID")
	public int getFualtypeid() {
		return fualtypeid;
	}
	public void setFualtypeid(int fualtypeid) {
		this.fualtypeid = fualtypeid;
	}
	public String getFaultypename() {
		return faultypename;
	}
	public void setFaultypename(String faultypename) {
		this.faultypename = faultypename;
	}
	public String getFalutypedesc() {
		return falutypedesc;
	}
	public void setFalutypedesc(String falutypedesc) {
		this.falutypedesc = falutypedesc;
	}

	@OneToMany(mappedBy = "fualtype", cascade = CascadeType.ALL)
	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
}
