package com.cg.optfs.dao;

import com.cg.optfs.entity.*;

import java.util.List;
import com.cg.optfs.utils.*;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import com.cg.optfs.entity.Tutor;

public class TutorDAOImpl implements TutorDAO {
	final static Logger logger = Logger.getLogger(TutorDAOImpl.class);
	EntityManager manager;

	public TutorDAOImpl() {
		manager = DbUtil.getConnection();
	}

	@Override
	public Tutor updateProfile(Tutor tutor) {
		// TODO Auto-generated method stub
		logger.info("Tutor updateProfile Dao started");
		manager.merge(tutor);

		return tutor;
	}

	@Override
	public List<Request> ViewRequest(Request request, int tutorid) {
		// TODO Auto-generated method stub
		logger.info("Tutor viewRequest Dao started");
		String qStr = "SELECT request FROM Request  WHERE request.tutorid LIKE :tutorid";
		TypedQuery<Request> query = manager.createQuery(qStr, Request.class);
		query.setParameter("ptitle", "%" + tutorid + "%");
		return query.getResultList();

	}

	@Override
	public List<BookedTutor> ViewBookings(BookedTutor bookings, int tutorid) {
		// TODO Auto-generated method stub
		logger.info("Tutor viewBooking Dao started");
		String qStr = "SELECT bookings FROM BookedTutor  WHERE bookings.tutorid LIKE :tutorid";
		TypedQuery<BookedTutor> query = manager.createQuery(qStr, BookedTutor.class);
		query.setParameter("ptitle", "%" + tutorid + "%");
		return query.getResultList();

	}

}
