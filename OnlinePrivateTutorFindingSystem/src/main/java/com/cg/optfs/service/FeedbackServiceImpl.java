package com.cg.optfs.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.cg.optfs.dao.FeedbackDAO;
import com.cg.optfs.dao.FeedbackDAOImpl;
import com.cg.optfs.entity.Feedback;

public class FeedbackServiceImpl implements FeedbackService{
	final static Logger logger = Logger.getLogger(FeedbackServiceImpl.class);
     FeedbackDAO fdao;
     public FeedbackServiceImpl() {
    	
    	 fdao=new FeedbackDAOImpl();
     }
	@Override
	public Feedback addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		 logger.info("Feedback addFeedback service started");
		return fdao.addFeedback(feedback);
	}

	@Override
	public List<Feedback> viewFeedback(int tutorId) {
		// TODO Auto-generated method stub
		logger.info("Feedback viewFeedback service started");
		return fdao.viewFeedback(tutorId);
	}

	
}
