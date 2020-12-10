package com.cg.optfs.service;


import java.util.List;


import com.cg.optfs.dao.RequestDAO;
import com.cg.optfs.entity.Request;

public class RequestServiceImpl implements RequestService{
	 RequestDAO dao;
	@Override
	public List<Request> viewRequest(Request request) {
		return dao.viewRequest(request);
		// TODO Auto-generated method stub
		
	}

}
