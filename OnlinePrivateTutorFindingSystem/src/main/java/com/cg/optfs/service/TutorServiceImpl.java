package com.cg.optfs.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.cg.optfs.dao.TutorDAO;
import com.cg.optfs.dao.TutorDAOImpl;
import com.cg.optfs.entity.BookedTutor;
import com.cg.optfs.entity.Request;
import com.cg.optfs.entity.Tutor;

public class TutorServiceImpl implements TutorService {
	final static Logger logger = Logger.getLogger(TutorServiceImpl.class);
	TutorDAO tdao;

	public TutorServiceImpl() {
		tdao = new TutorDAOImpl();
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

}
