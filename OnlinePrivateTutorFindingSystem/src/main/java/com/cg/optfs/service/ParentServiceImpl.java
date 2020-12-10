package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.dao.ParentDAO;
import com.cg.optfs.dao.ParentDAOImpl;
import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.Request;

public class ParentServiceImpl implements ParentService {
	ParentDAO pdao;
	public ParentServiceImpl(){
		pdao=new ParentDAOImpl();
	}
	@Override
	public Parent addParent(Parent parent) {
		// TODO Auto-generated method stub
		return pdao.addParent(parent);
	}
	@Override
	public Parent updateParent(Parent parent) {
		// TODO Auto-generated method stub
		return pdao.updateParent(parent);
	}
	@Override
	public List<Parent> viewAllParents() {
		// TODO Auto-generated method stub
		return pdao.viewAllParents();
	}
	@Override
	public Request requestDemo(Request request) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean loginParent(String username, String password) {
		
		return pdao.loginParent(username, password);
	}
	
}
