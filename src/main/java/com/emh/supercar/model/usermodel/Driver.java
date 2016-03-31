package com.emh.supercar.model.usermodel;

import java.util.Date;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.emh.supercar.model.places.Branch;

/**
 * 
 * @author earmongheng
 *
 */

@Entity
@Table(name = "DRIVER")
@AttributeOverrides({@AttributeOverride(name = "username", column = @Column(name = "USER_NAME")),
	 @AttributeOverride(name = "password", column = @Column(name = "PASSWORD")),
	 @AttributeOverride(name = "dob", column = @Column(name = "DATE")),
	 @AttributeOverride(name = "gender", column = @Column(name = "GENDER")),
	 @AttributeOverride(name = "joindate", column = @Column(name = "JOIN_DATE")),
	 @AttributeOverride(name = "role", column = @Column(name = "ROLE"))
	})
public class Driver extends Employee {

	private String licensenumber;

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Driver(int userid, String username, String password, Date dob, String gender, Set<Address> addresses,
			Date joindate, String role, Branch branch, String licensenumber) {
		super(userid, username, password, dob, gender, addresses, joindate, role, branch);
		this.licensenumber = licensenumber;
	}

	public Driver(Date joindate, String role, Branch branch, String licensenumber) {
		super(joindate, role, branch);
		this.licensenumber = licensenumber;
	}
	
	public String getLicensenumber() {
		return licensenumber;
	}

	public void setLicensenumber(String licensenumber) {
		this.licensenumber = licensenumber;
	}

}
