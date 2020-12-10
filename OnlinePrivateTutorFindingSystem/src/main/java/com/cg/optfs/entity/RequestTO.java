package com.cg.optfs.entity;

import javax.persistence.Column;

public class RequestTO {
	
	private int parentId;
	
	private int tutorId;
	
	private String subject ;
	
	

	public RequestTO(int parentId, int tutorId, String subject) {
		super();
		this.parentId = parentId;
		this.tutorId = tutorId;
		this.subject = subject;
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
		return "Request [parentId=" + parentId + ", tutorId=" + tutorId + ", subject=" + subject + "]";
	}

}
