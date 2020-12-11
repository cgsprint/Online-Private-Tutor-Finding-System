package com.cg.optfs.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import com.cg.optfs.entity.Request;
import com.cg.optfs.utils.DbUtil;

public class RequestDAOImpl implements RequestDAO{
	final static Logger logger = Logger.getLogger(RequestDAOImpl.class);
	EntityManager emanager;	
	public  RequestDAOImpl() {
		// TODO Auto-generated constructor stub
		emanager= DbUtil.getConnection();
	}
	@Override
	public List<Request> viewRequest(Request request) {
		logger.info("Request viewRequest DAO started");
		TypedQuery<Request> query=emanager.createQuery("select r.request from Request r where r.type=:abc",Request.class);
//		query.setParameter("abc", type);
		List<Request> list=query.getResultList();
		return list;
		
	}
	@Override
	public Request requestDemo(Request request) {
		
		emanager.getTransaction().begin();
		emanager.persist(request);
		emanager.getTransaction().commit();
		return request;
	}

}
