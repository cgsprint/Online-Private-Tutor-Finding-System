package com.cg.optfs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import com.cg.optfs.entity.Parent;
import com.cg.optfs.utils.DbUtil;

public class ParentDAOImpl implements ParentDAO {

	final static Logger logger = Logger.getLogger(ParentDAOImpl.class);
	EntityManager manager;
	public  ParentDAOImpl() {
		// TODO Auto-generated constructor stub
		manager= DbUtil.getConnection();
	}
	@Override
	public Parent addParent(Parent parent) {
		// TODO Auto-generated method stub
		logger.info("Parent addParent DAO started");
		manager.getTransaction().begin();
		manager.persist(parent);
		manager.getTransaction().commit();
		return parent;
	}
	@Override
	public List<Parent> viewAllParents() {
		// TODO Auto-generated method stub
		logger.info("Parent viewParent DAO started");
		Query query =manager.createQuery("from Parent");
		 List<Parent> arr_cust =query.getResultList(); 
		 return arr_cust;
	}
	@Override
	public Parent updateParent(Parent parent) {
		// TODO Auto-generated method stub
		logger.info("Parent updateParent DAO started");
		manager.merge(parent);
		return parent;
	}
	@Override
	public boolean loginParent(String username, String password) {
		logger.info("Parent login DAO started");
//		TypedQuery<Parent> query=manager.createQuery("select cc.password from Parent cc where cc.username=:username",Parent.class);
		TypedQuery<Parent> query=manager.createQuery("select cc from Parent cc where cc.username = :username AND cc.password = :password",Parent.class);
		 query.setParameter("username",username);
		 query.setParameter("password",password);
		 List<Parent> results = query.getResultList();
		if(!results.isEmpty())
		{
			return true;
		}
		return false;
		/*
		 * query.setParameter("username",username); String
		 * password1=query.getSingleResult().toString(); if(password.equals(password1))
		 * { return true; } return false;
		 */
	}
	@Override
	public String getAddress(String p_username) {
		TypedQuery<Parent> query = manager.createQuery("select p from Parent p where p.username =:username",Parent.class);
		query.setParameter("username", p_username);
		Parent parent = query.getSingleResult();
		String addr = parent.getAddress();
		return addr;
	}
	@Override
	public Parent getParent(String p_username1) {
		
		TypedQuery<Parent> query = manager.createQuery("select p from Parent p where p.username =:username",Parent.class);
		query.setParameter("username", p_username1);
		Parent parent = query.getSingleResult();
		return parent;
	}





}
