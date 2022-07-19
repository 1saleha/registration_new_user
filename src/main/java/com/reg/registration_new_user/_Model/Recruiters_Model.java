package com.reg.registration_new_user._Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "recruiters")
//@NamedStoredProcedureQueries({
//@NamedStoredProcedureQuery(name = "gellAll",procedureName = "gellAll"),
//@NamedStoredProcedureQuery(name = "getBlogsByTitle", procedureName = "getBlogsByTitle", parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "tblogTitle",type=String.class)} )})
public class Recruiters_Model {
	
	@Column
	private String name;
	
	@Column
	private String domain;
	
	@Column
	private String company;
	
	@Column
	private String location;
	
	@Column
	private String skills;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public Recruiters_Model() {};

	public Recruiters_Model(String name, String domain, String company, String location, String skills, long id) {
		super();
		this.name = name;
		this.domain = domain;
		this.company = company;
		this.location = location;
		this.skills = skills;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDomain() {
		return domain;
	}


	public void setDomain(String domain) {
		this.domain = domain;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


}
