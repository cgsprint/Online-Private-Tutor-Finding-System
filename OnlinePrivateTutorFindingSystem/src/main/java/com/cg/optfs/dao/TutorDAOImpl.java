package com.cg.optfs.dao;

import com.cg.optfs.entity.*;

import java.util.List;
import com.cg.optfs.utils.*;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

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

	@Override
	public boolean loginTutor(String tutor_username, String tutor_password) {
		
		logger.info("Tutor DAO login started");
		TypedQuery<Tutor> query=manager.createQuery("select tt from Tutor tt where tt.username = :username AND tt.password = :password",Tutor.class);
		 query.setParameter("username",tutor_username);
		 query.setParameter("password",tutor_password);
		 List<Tutor> results = query.getResultList();
		if(!results.isEmpty())
		{
			return true;
		}
		return false;
	}

	/*
	 * @Override public String getAddress(String p_username) {
	 * 
	 * 
	 * return null; }
	 */

	@Override
	public List<Tutor> viewTutor(String addr) {
		
		TypedQuery<Tutor> query = manager.createQuery("select t from Tutor t where t.address =:address",Tutor.class);
		query.setParameter("address", addr);
		List<Tutor> tlst = query.getResultList();
		return tlst;
	}


	public Tutor getTutor(String t_username) {
		// TODO Auto-generated method stub
		TypedQuery<Tutor> query = manager.createQuery("select t from Tutor t where t.username =:username",Tutor.class);
		query.setParameter("username", t_username);
		Tutor tutor = query.getSingleResult();
		return tutor;
	}

}
