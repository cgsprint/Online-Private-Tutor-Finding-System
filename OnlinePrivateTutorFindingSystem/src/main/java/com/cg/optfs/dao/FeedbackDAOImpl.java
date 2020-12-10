package com.cg.optfs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import com.cg.optfs.entity.Feedback;
import com.cg.optfs.service.TutorServiceImpl;
import com.cg.optfs.utils.DbUtil;
public class FeedbackDAOImpl implements FeedbackDAO{
	final static Logger logger = Logger.getLogger(FeedbackDAOImpl.class);
	EntityManager emanager;
	public FeedbackDAOImpl() {
		emanager= DbUtil.getConnection();
	}
	@Override
	public Feedback addFeedback(Feedback feedback) {
		logger.info("Feedback addFeedback DAO started");
		emanager.getTransaction().begin();
		emanager.persist(feedback);
		emanager.getTransaction().commit();
		return feedback;
	}

	@Override
	public List<Feedback> viewFeedback(int tutorId) {
		logger.info("Feedback viewFeedback DAO started");
		TypedQuery<Feedback> query=emanager.createQuery("select cc.feedback from Feedback cc where cc.tutorId=:tutorId",Feedback.class);
		query.setParameter("tutorId", tutorId);
		List<Feedback> list=query.getResultList();
		return null;
	}
}