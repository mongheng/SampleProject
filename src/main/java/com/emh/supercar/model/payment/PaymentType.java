package com.emh.supercar.model.payment;

public class PaymentType {
	
	private int paymenttypeid;
	private String description;
	
	public PaymentType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentType(int paymenttypeid, String description) {
		super();
		this.paymenttypeid = paymenttypeid;
		this.description = description;
	}

	public int getpaymenttypeid() {
		return paymenttypeid;
	}

	public void setpaymenttypeid(int paymenttypeid) {
		this.paymenttypeid = paymenttypeid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
