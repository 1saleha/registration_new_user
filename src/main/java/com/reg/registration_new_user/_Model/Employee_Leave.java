package com.reg.registration_new_user._Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Leave")
public class Employee_Leave {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String Email;
	
	@Column
	private String Psnumber;
	
	@Column
	private String Fromdate;
	
	@Column
	private String Todate;
	
	@Column
	private String Description;
	
	@Column
	private String Status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPsnumber() {
		return Psnumber;
	}

	public void setPsnumber(String psnumber) {
		Psnumber = psnumber;
	}

	public String getFromdate() {
		return Fromdate;
	}

	public void setFromdate(String fromdate) {
		Fromdate = fromdate;
	}

	public String getTodate() {
		return Todate;
	}

	public void setTodate(String todate) {
		Todate = todate;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
public Employee_Leave(){
		
	}

	public Employee_Leave(String email, String psnumber, String fromdate, String todate, String description,
			String status) {
		super();
		Email = email;
		Psnumber = psnumber;
		Fromdate = fromdate;
		Todate = todate;
		Description = description;
		Status = status;
	}
	
}
