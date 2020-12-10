package com.cg.optfs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Request")
public class Request {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="parent_id")
	private int parentId;
	
	@Column(name="tutor_id")
	private int tutorId;
	
	private String subject ;
	
	private int date;
	
	private int time;

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getTutorId() {
		return tutorId;
	}

	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Request [parentId=" + parentId + ", tutorId=" + tutorId + ", subject=" + subject + ", date=" + date
				+ ", time=" + time + "]";
	}
	public static void main(String[] args) {
		
		Tutor tutor = new Tutor();
		String status =tutor.getStatus();
		
		switch(status)
		{
		case "Accept" : System.out.println(status.toString());
		break;
		
		case "Reject" : System.out.println(status.toString());
		break;
		}
	}
	
	
	
}

