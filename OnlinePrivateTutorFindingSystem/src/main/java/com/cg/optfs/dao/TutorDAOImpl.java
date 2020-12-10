package com.cg.optfs.dao;
import com.cg.optfs.entity.*;
import java.util.List;
import com.cg.optfs.utils.*;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.optfs.entity.Tutor;

public class TutorDAOImpl implements TutorDAO {
	
	EntityManager manager;
	
	public TutorDAOImpl() {
		manager=DbUtil.getConnection();
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
	public List<BookedTutor> ViewBookings(BookedTutor bookings, int tutorid) {
		// TODO Auto-generated method stub
		String qStr = "SELECT name FROM Bookings book WHERE bookings.tutorid LIKE :tutorid";
		TypedQuery<BookedTutor> query = manager.createQuery(qStr, BookedTutor.class);
		query.setParameter("ptitle", "%"+tutorid+"%");
		return query.getResultList();
		
	}
 
	
	
}
