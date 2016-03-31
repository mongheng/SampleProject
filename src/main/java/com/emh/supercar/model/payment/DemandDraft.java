package com.emh.supercar.model.payment;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author monghengear
 *
 */
public class DemandDraft implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ddnumber;
	private String bankname;
	private String branch;
	private int amount;
	private Date deposite_date;
	private Date expire_date;
	private Payment payment;//many to one.
	
	public DemandDraft() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemandDraft(String ddnumber, String bankname, String branch, int amount, Date deposite_date, Date expire_date,
			Payment payment) {
		super();
		this.ddnumber = ddnumber;
		this.bankname = bankname;
		this.branch = branch;
		this.amount = amount;
		this.deposite_date = deposite_date;
		this.expire_date = expire_date;
		this.payment = payment;
	}

	public String getDdnumber() {
		return ddnumber;
	}

	public void setDdnumber(String ddnumber) {
		this.ddnumber = ddnumber;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDeposite_date() {
		return deposite_date;
	}

	public void setDeposite_date(Date deposite_date) {
		this.deposite_date = deposite_date;
	}

	public Date getExpire_date() {
		return expire_date;
	}

	public void setExpire_date(Date expire_date) {
		this.expire_date = expire_date;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())){
			return false;
		}
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
