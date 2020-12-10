package com.cg.optfs.entity;

import javax.persistence.Column;

public class FeedbackTO {

private int feedbackId;
	
	private int tutorId;
	
	private int parentId;
	private int rating;
	
	
	public FeedbackTO(int feedbackId, int tutorId, int parentId, int rating) {
		super();
		this.feedbackId = feedbackId;
		this.tutorId = tutorId;
		this.parentId = parentId;
		this.rating = rating;
	}
	
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
