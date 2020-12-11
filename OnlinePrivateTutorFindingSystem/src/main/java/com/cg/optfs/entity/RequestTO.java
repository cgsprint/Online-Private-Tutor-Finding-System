package com.cg.optfs.entity;

import javax.persistence.Column;

public class RequestTO {
	
	private int parentId;
	
	private int tutorId;
	
	private String subject ;
	
	private String date;
	
	private String time;
	
	

	public RequestTO() {
		
	}

	public RequestTO(int parentId, int tutorId, String subject, String date, String time) {
		super();
		this.parentId = parentId;
		this.tutorId = tutorId;
		this.subject = subject;
		this.date = date;
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

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

	@Override
	public String toString() {
		return "RequestTO [parentId=" + parentId + ", tutorId=" + tutorId + ", subject=" + subject + ", date=" + date
				+ ", time=" + time + "]";
	}

	

}
