package com.reg.registration_new_user._Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salaries")
public class Salary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	

	@Column
	private String EmailId;
	
	@Column
	private String PSNO;
	
	public Salary() {
		
	}
	
	public Salary(long id, String emailId, String pSNO, String month, String year, String amount) {
		super();
		this.id = id;
		EmailId = emailId;
		PSNO = pSNO;
		Month = month;
		Year = year;
		Amount = amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getPSNO() {
		return PSNO;
	}

	public void setPSNO(String pSNO) {
		PSNO = pSNO;
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

	@Column
	private String Month;
	
	@Column
	private String Year;
	
	@Column
	private String Amount;
}
