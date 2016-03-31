package com.emh.supercar.model.transaction;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author earmongheng
 *
 */

@Entity
@Table(name = "TIMESHEET")
public class Timesheet {
	
	private int timesheetid;
	private Date fromtime;
	private Date totime;
	private Date fromdate;
	private Date todate;
	
	public Timesheet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Timesheet(int timesheetid, Date fromtime, Date totime, Date fromdate, Date todate) {
		super();
		this.timesheetid = timesheetid;
		this.fromtime = fromtime;
		this.totime = totime;
		this.fromdate = fromdate;
		this.todate = todate;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TIMESHEET_ID")
	public int getTimesheetid() {
		return timesheetid;
	}
	public void setTimesheetid(int timesheetid) {
		this.timesheetid = timesheetid;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FROMTIME")
	public Date getFromtime() {
		return fromtime;
	}
	public void setFromtime(Date fromtime) {
		this.fromtime = fromtime;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "TOTIME")
	public Date getTotime() {
		return totime;
	}
	public void setTotime(Date totime) {
		this.totime = totime;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FROMDATE")
	public Date getFromdate() {
		return fromdate;
	}
	public void setFromdate(Date fromdate) {
		this.fromdate = fromdate;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "TODATE")
	public Date getTodate() {
		return todate;
	}
	public void setTodate(Date todate) {
		this.todate = todate;
	}
	
}
