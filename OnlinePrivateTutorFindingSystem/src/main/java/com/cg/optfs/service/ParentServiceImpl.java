package com.cg.optfs.service;

import com.cg.optfs.dao.ParentDAO;
import com.cg.optfs.dao.ParentDAOImpl;
import com.cg.optfs.entity.Parent;

public class ParentServiceImpl implements ParentService {
	ParentDAO pdao;
	@Override
	public Parent addParent(Parent parent) {
		// TODO Auto-generated method stub
		pdao=new ParentDAOImpl();
		return null;
	}

	@Override
	public Parent updateParent(Parent parent) {
		// TODO Auto-generated method stub
		return null;
	}

}
