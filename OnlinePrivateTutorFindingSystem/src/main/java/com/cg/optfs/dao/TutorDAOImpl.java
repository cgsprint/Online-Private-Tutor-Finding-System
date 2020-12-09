package com.cg.optfs.dao;

import java.util.List;
import com.cg.optfs.utils.*;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.optfs.entity.Tutor;

public class TutorDAOImpl implements TutorDAO {
	
	EntityManager manager;
	
	public TutorDAOImpl() {
		manager=utils.getConnection();
	}

	@Override
	public Tutor updateProfile(Tutor tutor) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(tutor);
		manager.getTransaction().commit();
		return tutor;
	}

	@Override
	public List<Request> ViewRequest(Request request,int tutorid) {
		// TODO Auto-generated method stub
		String qStr = "SELECT name FROM request book WHERE request.tutorid LIKE :tutorid";
		TypedQuery<Request> query = manager.createQuery(qStr, Request.class);
		query.setParameter("ptitle", "%"+tutorid+"%");
		return query.getResultList();
		
		
	}

	@Override
	public List<Bookings> ViewBookings(Bookings bookings, int tutorid) {
		// TODO Auto-generated method stub
		String qStr = "SELECT name FROM Bookings book WHERE bookings.tutorid LIKE :tutorid";
		TypedQuery<Bookings> query = manager.createQuery(qStr, Bookings.class);
		query.setParameter("ptitle", "%"+tutorid+"%");
		return query.getResultList();
		return null;
	}
 
	
	
}
