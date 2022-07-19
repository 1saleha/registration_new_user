package com.reg.registration_new_user._Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Timesheet")
public class Timesheet_Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String Email;
	
	@Column
	private String Worktitle;
	
	@Column
	private String Date;
	
	@Column
	private String Hours;
	
	public  Timesheet_Model() {
		
	}
	
	public Timesheet_Model(String email, String worktitle, String date, String hours, String status) {
		super();
		Email = email;
		Worktitle = worktitle;
		Date = date;
		Hours = hours;
		Status = status;
	}

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

	public String getWorktitle() {
		return Worktitle;
	}

	public void setWorktitle(String worktitle) {
		Worktitle = worktitle;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getHours() {
		return Hours;
	}

	public void setHours(String hours) {
		Hours = hours;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Column
	private String Status;
	

}
