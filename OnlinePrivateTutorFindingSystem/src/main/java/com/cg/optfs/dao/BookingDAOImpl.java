package com.cg.optfs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.optfs.entity.Booking;
import com.cg.optfs.utils.DbUtil;
public class BookingDAOImpl implements BookingDAO {

	EntityManager emanager;	
	public  BookingDAOImpl() {
		// TODO Auto-generated constructor stub
		emanager= DbUtil.getConnection();
	}
	@Override
	public List<Booking> viewAllBooking() {
		// TODO Auto-generated method stub
		
		 TypedQuery<Booking> query=emanager.createQuery("select b.booking from BookedTutor b where b.type=:abc",Booking.class);
//		query.setParameter("abc", type);
			List<Booking> list=query.getResultList();
		return list;
	}
}
