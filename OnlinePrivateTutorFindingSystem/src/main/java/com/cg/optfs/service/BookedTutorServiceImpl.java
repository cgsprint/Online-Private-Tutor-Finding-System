package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.dao.BookedTutorDAO;
import com.cg.optfs.entity.BookedTutor;

public class BookedTutorServiceImpl implements BookedTutorService {
  BookedTutorDAO dao;
	
	
	@Override
	public List<BookedTutor> viewBookedTutor(BookedTutor bookedtutor) {
		// TODO Auto-generated method stub
		return dao.viewBookedTutor(bookedtutor);
	}
}
