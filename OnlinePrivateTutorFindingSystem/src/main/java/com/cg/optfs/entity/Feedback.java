package com.cg.optfs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="feedbackId",length=4)
	private int feedbackId;
	
	@Column(name="tutorId",length=4)
	private int tutorId;
	@Column(name="parentId",length=4)
	private int parentId;
	@Column(name="rating",length=3)
	private int rating;
	
	public int getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Feedback [tutorId=" + tutorId + ", parentId=" + parentId + ", rating=" + rating + "]";
	}
	

}
