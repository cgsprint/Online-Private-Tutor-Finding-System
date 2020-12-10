package com.cg.optfs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.hibernate.annotations.Parent;

import com.cg.optfs.entity.Admin;
import com.cg.optfs.entity.Tutor;
//import com.cg.optfs.entity.Tutor;
import com.cg.optfs.utils.DbUtil;

public class AdminDAOImpl implements AdminDAO{

	final static Logger logger = Logger.getLogger(AdminDAOImpl.class);
	EntityManager emanager;	
	public  AdminDAOImpl() {
		// TODO Auto-generated constructor stub
		emanager= DbUtil.getConnection();
	}
	@Override
	public boolean loginAdmin(String username, String password) {
		
		logger.info("Admin DAO login started");
		TypedQuery<Admin> query=emanager.createQuery("select cc from Admin cc where cc.username = :username AND cc.password = :password",Admin.class);
		 query.setParameter("username",username);
		 query.setParameter("password",password);
		 List<Admin> results = query.getResultList();
		if(!results.isEmpty())
		{
			return true;
		}
		return false;
	}

	
	
	
	@Override
	public Tutor addTutor(Tutor tutor) {
	
		emanager.getTransaction().begin();
		emanager.persist(tutor);
		emanager.getTransaction().commit();
		return tutor;
	}
	

}
