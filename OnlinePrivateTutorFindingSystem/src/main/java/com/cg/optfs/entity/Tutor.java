package com.cg.optfs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TUTOR")
public class Tutor {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SUBJECT")
	public String subject;
    @Column(name = "PHONENUMBER")
	public String phonenumber;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "QUALIFICATON")
	private String qualification;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;
	
	public Tutor() {
		
	}
	
	public Tutor( String name, String subject, String phonenumber, String address, String qualification,String username,String password) {
		super();
//		this.id = id;
		this.name = name;
		this.subject = subject;
		this.phonenumber = phonenumber;
		this.address = address;
		this.qualification = qualification;
		this.username=username;
		this.password=password;
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
		return "Tutor [id=" + id + ", name=" + name + ", subject=" + subject + ", phonenumber=" + phonenumber
				+ ", address=" + address + ", qualification=" + qualification + ", username=" + username + "]";
	}
	
	
	
}
