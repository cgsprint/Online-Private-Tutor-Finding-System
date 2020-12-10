package com.cg.optfs.entity;

import javax.persistence.Column;

public class BookedTutorTO {
	
	private int requestId;
	
	
	
	private int parentId;
	
	private int tutorId;

	
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
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

	@Override
	public String toString() {
		return "BookedTutor [requestId="+ requestId +",parentId=" + parentId + ", tutorId=" + tutorId + "]";
	}
	


}
