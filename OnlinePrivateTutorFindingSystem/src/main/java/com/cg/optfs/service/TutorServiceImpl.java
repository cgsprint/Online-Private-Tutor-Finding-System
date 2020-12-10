package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.dao.TutorDAO;
import com.cg.optfs.dao.TutorDAOImpl;
import com.cg.optfs.entity.BookedTutor;
import com.cg.optfs.entity.Request;
import com.cg.optfs.entity.Tutor;

public class TutorServiceImpl implements TutorService{
     TutorDAO tdao;
     public TutorServiceImpl(){
 		tdao=new TutorDAOImpl();
 	}
	@Override
	public List<Request> viewRequest(Request request, int tutorid) {
		// TODO Auto-generated method stub
		return tdao.ViewRequest(request,tutorid);
	}

	@Override
	public List<BookedTutor> ViewBookings(BookedTutor bookings, int tutorid) {
		// TODO Auto-generated method stub
		return tdao.ViewBookings(bookings,tutorid);
	}

	@Override
	public Tutor updateProfile(Tutor tutor) {
		// TODO Auto-generated method stub
		return tdao.updateProfile(tutor);
	}


}
