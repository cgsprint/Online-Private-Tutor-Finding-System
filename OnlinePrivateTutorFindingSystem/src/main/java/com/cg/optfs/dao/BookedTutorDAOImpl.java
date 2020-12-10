package com.cg.optfs.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.optfs.entity.BookedTutor;
import com.cg.optfs.utils.DbUtil;

public class BookedTutorDAOImpl implements BookedTutorDAO {

	EntityManager emanager;	
	public  BookedTutorDAOImpl() {
		// TODO Auto-generated constructor stub
		emanager= DbUtil.getConnection();
	}
	
	@Override
	public List<BookedTutor> viewBookedTutor(BookedTutor bookedtutor) {
		TypedQuery<BookedTutor> query=emanager.createQuery("select bk.bookedtutor from BookedTutor bk where bk.type=:abc",BookedTutor.class);
//		query.setParameter("abc", type);
		List<BookedTutor> list=query.getResultList();
		return list;
		
	}
	

}

