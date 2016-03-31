package com.emh.supercar.model.places;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author monghengear
 *
 */

@Entity
@Table(name = "BRANCH")
public class Branch {
	
	private int branchid;
	private String name;
	private String contact;
	private String faxnumber;
	
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch(int branchid, String name, String contact, String faxnumber) {
		super();
		this.branchid = branchid;
		this.name = name;
		this.contact = contact;
		this.faxnumber = faxnumber;
	}
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getFaxnumber() {
		return faxnumber;
	}
	public void setFaxnumber(String faxnumber) {
		this.faxnumber = faxnumber;
	}
	
}
