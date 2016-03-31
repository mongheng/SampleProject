package com.emh.supercar.model.usermodel;

import java.util.Date;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "EMPLOYEE")
@AttributeOverrides({@AttributeOverride(name = "username", column = @Column(name = "USER_NAME")),
					 @AttributeOverride(name = "password", column = @Column(name = "PASSWORD")),
					 @AttributeOverride(name = "dob", column = @Column(name = "DATE")),
					 @AttributeOverride(name = "gender", column = @Column(name = "GENDER"))
					})
public class Employee extends User {

	private Date joindate;
	private String role;
	private Branch branch;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Date joindate, String role, Branch branch) {
		super();
		this.joindate = joindate;
		this.role = role;
		this.branch = branch;
	}
	
	public Employee(int userid, String username, String password, Date dob, String gender, Set<Address> addresses,
			Date joindate, String role, Branch branch) {
		super(userid, username, password, dob, gender, addresses);
		this.joindate = joindate;
		this.role = role;
		this.branch = branch;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "JOIN_DATE")
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
	@Column(name = "ROLE")
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BRANCH_ID")
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
}
