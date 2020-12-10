package com.cg.optfs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.optfs.entity.Parent;
import com.cg.optfs.utils.DbUtil;

public class ParentDAOImpl implements ParentDAO {

	EntityManager manager;
	public  ParentDAOImpl() {
		// TODO Auto-generated constructor stub
		manager= DbUtil.getConnection();
	}

	public Parent addParent(Parent parent) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(parent);
		manager.getTransaction().commit();
		return parent;
	}


	public List<Parent> viewAllParents() {
		// TODO Auto-generated method stub
		TypedQuery<Parent> query=manager.createQuery("select cc.parent from AllotedCreditCard cc",Parent.class);
		List<Parent> list=query.getResultList();
		return list;
	}
	public Parent updateParent(Parent parent) {
		// TODO Auto-generated method stub
		manager.merge(parent);
		return parent;
	}




}
