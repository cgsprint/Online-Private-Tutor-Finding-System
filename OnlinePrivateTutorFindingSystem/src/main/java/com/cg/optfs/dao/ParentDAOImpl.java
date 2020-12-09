package com.cg.optfs.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.cg.optfs.entity.Parent;

public class ParentDAOImpl implements ParentDAO {

	EntityManager manager;
	public  ParentDAOImpl() {
		// TODO Auto-generated constructor stub
		manager= DbUtil.getConnection();
	}
	@Override
	public Parent addParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parent updateParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Parent> viewAllParents() {
		// TODO Auto-generated method stub
		return null;
	}




}
