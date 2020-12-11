package com.cg.optfs.entity;

import javax.persistence.Column;

public class ParentTO {

	private int parentId;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String mobileNo;
	private String email;
	private String address;
	
	public ParentTO() {
		
	}
	
	public ParentTO(String firstName, String lastName, String username, String password, String mobileNo,
			String email, String address) {
		super();
//		this.parentId = parentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.mobileNo = mobileNo;
		this.email = email;
		this.address = address;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", mobileNo=" + mobileNo + ", email=" + email + ", address="
				+ address + "]";
	}

}
