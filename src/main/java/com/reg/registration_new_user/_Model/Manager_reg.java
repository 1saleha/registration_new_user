package com.reg.registration_new_user._Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="Manager_reg")
public class Manager_reg {

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getManagername() {
		return managername;
	}

	public void setManagername(String managername) {
		this.managername = managername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Manager_reg(long id, String managername, String email, String mobilenumber, String password) {
		super();
		this.id = id;
		this.managername = managername;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String managername;
	
	@Column
	private String email;
	
	@Column
	private String mobilenumber;
	
	@Column
	private String password;
}
