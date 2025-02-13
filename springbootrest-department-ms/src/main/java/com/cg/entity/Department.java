package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="department_ms")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="dname")
	private String dname;
	

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Department(Integer id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
	}


	public Integer getId() {
		return id;
	}

	public String getDname() {
		return dname;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	

	
	
	

}
