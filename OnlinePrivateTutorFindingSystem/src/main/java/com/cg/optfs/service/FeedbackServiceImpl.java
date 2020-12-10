package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.dao.FeedbackDAO;
import com.cg.optfs.dao.FeedbackDAOImpl;
import com.cg.optfs.entity.Feedback;

public class FeedbackServiceImpl implements FeedbackService{
     FeedbackDAO fdao;
     public FeedbackServiceImpl() {
    	 fdao=new FeedbackDAOImpl();
     }
	@Override
	public Feedback addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return fdao.addFeedback(feedback);
	}

	@Override
	public List<Feedback> viewFeedback(int tutorId) {
		// TODO Auto-generated method stub
		return fdao.viewFeedback(tutorId);
	}

	
}
