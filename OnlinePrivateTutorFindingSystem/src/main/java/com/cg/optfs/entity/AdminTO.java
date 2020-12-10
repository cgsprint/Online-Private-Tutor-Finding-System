package com.cg.optfs.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class AdminTO {
	
	private int id;
	private String name;
	private String username;
	private String password;
	
	public AdminTO() {
		
	}
	
	public AdminTO(int id,String name,String username,String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setName(int id) {
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
