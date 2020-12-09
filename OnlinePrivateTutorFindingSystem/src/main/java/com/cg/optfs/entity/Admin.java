package com.cg.optfs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADMIN")
public class Admin {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;
	
	public Admin() {
		
	}
	
	public Admin(String name,String username,String password) {
		super();
//		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
