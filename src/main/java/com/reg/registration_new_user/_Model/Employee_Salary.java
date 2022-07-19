package com.reg.registration_new_user._Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="salaries")
public class Employee_Salary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String PS_nummber;
	
	@Column
	private String EmailId;
	
	@Column
	private String Month;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPS_nummber() {
		return PS_nummber;
	}

	public void setPS_nummber(String pS_nummber) {
		PS_nummber = pS_nummber;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getMonth() {
		return Month;
	}

	public void setMonth(String month) {
		Month = month;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}
	public Employee_Salary(){
		
	}

	public Employee_Salary(long id, String pS_nummber, String emailId, String month, String year, String amount) {
		super();
		this.id = id;
		PS_nummber = pS_nummber;
		EmailId = emailId;
		Month = month;
		Year = year;
		Amount = amount;
	}

	@Column
	private String Year;
	
	@Column
	private String Amount;
}
