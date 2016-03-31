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
 * @author monghengear
 *
 */
@Entity
@Table(name = "CARTYPE")
public class CarType {
	
	private int cartypeid;
	private String cartypename;
	private String cartypedesc;
	
	private Set<Car> cars;
	
	public CarType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarType(int cartypeid, String cartypename, String cartypedesc) {
		super();
		this.cartypeid = cartypeid;
		this.cartypename = cartypename;
		this.cartypedesc = cartypedesc;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CARTYPE_ID")
	public int getCartypeid() {
		return cartypeid;
	}

	public void setCartypeid(int cartypeid) {
		this.cartypeid = cartypeid;
	}

	public String getCartypename() {
		return cartypename;
	}

	public void setCartypename(String cartypename) {
		this.cartypename = cartypename;
	}

	public String getCartypedesc() {
		return cartypedesc;
	}

	public void setCartypedesc(String cartypedesc) {
		this.cartypedesc = cartypedesc;
	}

	@OneToMany(mappedBy = "cartype", cascade = CascadeType.ALL)
	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
}
