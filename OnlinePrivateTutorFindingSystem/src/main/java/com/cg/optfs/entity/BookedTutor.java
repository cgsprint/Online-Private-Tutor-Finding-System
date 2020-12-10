package com.cg.optfs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="BookedTutor")
public class BookedTutor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="requestId")
	private int requestId;
	

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	@Column(name="parent_id")
	private int parentId;
	
	@Column(name="tutor_id")
	private int tutorId;

	public int getRequestId() {
		return requestId;
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
	
	public static void main(String args[]) {
	    
	      Date date = new Date();

	      
	      System.out.println(date.toString());
	   }
	
}

