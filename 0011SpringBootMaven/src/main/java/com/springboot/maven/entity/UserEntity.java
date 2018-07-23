package com.springboot.maven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userDetail")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	
	

	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public UserEntity(Integer id, String fname, String lname) {
		super();
		Id = id;
		this.fname = fname;
		this.lname = lname;
	}
	
	public UserEntity() {
		super();
		
	}
	

}
