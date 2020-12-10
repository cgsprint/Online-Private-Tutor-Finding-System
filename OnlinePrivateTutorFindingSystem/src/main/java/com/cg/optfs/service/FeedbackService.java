package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.entity.Feedback;

public interface FeedbackService {

	public Feedback addFeedback(Feedback feedback);
	public List<Feedback> viewFeedback(int tutorId);
}
