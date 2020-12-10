package com.cg.optfs.dao;

import java.util.List;

import com.cg.optfs.entity.Feedback;
public interface FeedbackDAO {

	public Feedback addFeedback(Feedback feedback);
	public List<Feedback> viewFeedback(int tutorId);

}
