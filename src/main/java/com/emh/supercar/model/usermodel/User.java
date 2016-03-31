package com.emh.supercar.model.usermodel;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author monghengear
 *
 */
@Entity
@Table(name = "USER")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

	private int userid;
	private String username;
	private String password;
	private Date dob;
	private String gender;
	private Set<Address> addresses;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String password, Date dob, String gender, Set<Address> addresses) {
		super();
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.addresses = addresses;
	}

	public User(int userid, String username, String password, Date dob, String gender, Set<Address> addresses) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
		this.addresses = addresses;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	@Column(name = "USER_NAME")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE")
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Column(name = "GENDER")
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	
}
