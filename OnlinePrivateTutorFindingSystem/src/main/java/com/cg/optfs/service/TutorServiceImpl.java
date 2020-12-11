package com.cg.optfs.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.cg.optfs.dao.RequestDAO;
import com.cg.optfs.dao.RequestDAOImpl;
import com.cg.optfs.dao.TutorDAO;
import com.cg.optfs.dao.TutorDAOImpl;
import com.cg.optfs.entity.BookedTutor;
import com.cg.optfs.entity.Request;
import com.cg.optfs.entity.Tutor;

public class TutorServiceImpl implements TutorService {
	final static Logger logger = Logger.getLogger(TutorServiceImpl.class);
	TutorDAO tdao;
	RequestDAO rdao;

	public TutorServiceImpl() {
		tdao = new TutorDAOImpl();
		rdao=new RequestDAOImpl();
	}

	@Override
	public List<Request> viewRequest(Request request, int tutorid) {
		// TODO Auto-generated method stub
		logger.info("Tutor viewRequest service started");
		return tdao.ViewRequest(request, tutorid);
	}

	@Override
	public List<BookedTutor> ViewBookings(BookedTutor bookings, int tutorid) {
		// TODO Auto-generated method stub
		logger.info("Tutor viewBooking service started");
		return tdao.ViewBookings(bookings, tutorid);
	}

	@Override
	public Tutor updateProfile(Tutor tutor) {
		// TODO Auto-generated method stub
		logger.info("Tutor updateProfile service started");
		return tdao.updateProfile(tutor);
	}

	@Override
	public boolean loginTutor(String tutor_username, String tutor_password) {
		
		
		return tdao.loginTutor(tutor_username,tutor_password);
	}

	@Override
	public Tutor getTutor(String t_username) {
		// TODO Auto-generated method stub
		return tdao.getTutor(t_username);
	}

	@Override
	public List<Request> viewRequest(String t_username) {
		// TODO Auto-generated method stub
		int tutorid=tdao.getTutorId(t_username);
		return rdao.viewRequest(tutorid);
	}

}
