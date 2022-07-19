package com.reg.registration_new_user._Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new_companies")
public class New_Company_Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String Location;
	
	@Column
	private String Company_Name;
	
	@Column
	private int Salary;
	
	@Column
	private String Department;
	
	@Column
	private String Type_of_work;
	
	
	
	
	
	
	
	public New_Company_Model(){}
	public New_Company_Model(long id, String company_Name, String type_of_work, String department, String location,
			int salary) {
		super();
		this.id = id;
		Company_Name = company_Name;
		Type_of_work = type_of_work;
		Department = department;
		Location = location;
		Salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompany_Name() {
		return Company_Name;
	}
	public void setCompany_Name(String company_Name) {
		Company_Name = company_Name;
	}
	public String getType_of_work() {
		return Type_of_work;
	}
	public void setType_of_work(String type_of_work) {
		Type_of_work = type_of_work;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}

}
