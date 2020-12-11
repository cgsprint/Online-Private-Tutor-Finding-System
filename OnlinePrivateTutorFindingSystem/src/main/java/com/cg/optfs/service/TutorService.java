package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.entity.BookedTutor;
import com.cg.optfs.entity.Request;
import com.cg.optfs.entity.Tutor;

public interface TutorService {
	
	public List<Request> viewRequest(Request request,int tutorid);
	public List<BookedTutor> ViewBookings(BookedTutor bookings,int tutorid);
	public Tutor updateProfile(Tutor tutor);
	public boolean loginTutor(String tutor_username, String tutor_password);
	
	//public Tutor getTutor(String t_username);
	public Tutor getTutor(String t_username);

//	public List<>

}