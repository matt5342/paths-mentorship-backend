package com.pathsmentorship.pathsbackend.models;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="schools")
public class School {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	

	@NotNull
	private String name;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "access_code_id")
//	private AccessCode accessCode;
	
	public School() {}

	public School(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public AccessCode getAccessCode() {
//		return accessCode;
//	}
//
//	public void setAccessCode(AccessCode accessCode) {
//		this.accessCode = accessCode;
//	}
	
	
}
