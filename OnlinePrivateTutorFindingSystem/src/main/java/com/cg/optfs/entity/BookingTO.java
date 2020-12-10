package com.cg.optfs.entity;

import java.util.Date;

public class BookingTO {

	private int parentId;
	
	private String subject;

	
	public BookingTO(int parentId, String subject) {
		super();
		this.parentId = parentId;
		this.subject = subject;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "BookingTO [parentId=" + parentId + ", subject=" + subject + "]";
	}
	
	
	
	

}
