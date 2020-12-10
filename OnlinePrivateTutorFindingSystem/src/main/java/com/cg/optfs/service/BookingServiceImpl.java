package com.cg.optfs.service;

import java.util.List;
import com.cg.optfs.dao.BookingDAO;
import com.cg.optfs.dao.BookingDAOImpl;
import com.cg.optfs.entity.Booking;

public class BookingServiceImpl implements BookingService {
	BookingDAO bdao;
    public BookingServiceImpl() {
  	  bdao=new BookingDAOImpl();
    }
	@Override
	public List<Booking> viewAllBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bdao.viewAllBooking();
		
	}
	
}
