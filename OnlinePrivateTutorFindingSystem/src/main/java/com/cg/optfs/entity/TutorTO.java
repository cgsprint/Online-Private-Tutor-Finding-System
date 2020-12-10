package com.cg.optfs.entity;

import javax.persistence.Column;

public class TutorTO {
	private int id;
	private String name;
	public  String subject;
	public String phonenumber;
	private String address;
	private String qualification;
	
	
	
	public TutorTO(int id, String name, String subject, String phonenumber, String address, String qualification) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.phonenumber = phonenumber;
		this.address = address;
		this.qualification = qualification;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String string) {
		this.phonenumber = string;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "TutorTO [id=" + id + ", name=" + name + ", subject=" + subject + ", phonenumber=" + phonenumber
				+ ", address=" + address + ", qualification=" + qualification + "]";
	}

	
}
