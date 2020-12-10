package com.cg.optfs.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.optfs.entity.Request;
import com.cg.optfs.utils.DbUtil;

public class RequestDAOImpl implements RequestDAO{

	EntityManager emanager;	
	public  RequestDAOImpl() {
		// TODO Auto-generated constructor stub
		emanager= DbUtil.getConnection();
	}
	@Override
	public List<Request> viewRequest(Request request) {
		TypedQuery<Request> query=emanager.createQuery("select r.request from Request r where r.type=:abc",Request.class);
//		query.setParameter("abc", type);
		List<Request> list=query.getResultList();
		return list;
		
	}

}
