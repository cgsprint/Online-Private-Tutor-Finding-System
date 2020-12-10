package com.cg.optfs.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.cg.optfs.dao.ParentDAO;
import com.cg.optfs.dao.ParentDAOImpl;
import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.ParentTO;
import com.cg.optfs.entity.Request;

public class ParentServiceImpl implements ParentService {
	final static Logger logger = Logger.getLogger(ParentServiceImpl.class);
	ParentDAO pdao;
	public ParentServiceImpl(){
		pdao=new ParentDAOImpl();
	}
	
	@Override
	public Parent updateParent(Parent parent) {
		// TODO Auto-generated method stub
		logger.info("Parent updateParent service started");
		return pdao.updateParent(parent);
	}
	@Override
	public List<Parent> viewAllParents() {
		// TODO Auto-generated method stub
		logger.info("Parent listParent service started");
		return pdao.viewAllParents();
	}
	@Override
	public Request requestDemo(Request request) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean loginParent(String username, String password) {
		logger.info("Parent login service started");
		return pdao.loginParent(username, password);
	}
	@Override
	public Parent addParent(ParentTO parentto) {
		logger.info("Parent addParent service started");
		Parent parent = new Parent(parentto.getFirstName(),parentto.getLastName(),parentto.getUsername(),parentto.getPassword(),parentto.getMobileNo(),parentto.getEmail(),parentto.getAddress());
		return null;
	}
	
}
