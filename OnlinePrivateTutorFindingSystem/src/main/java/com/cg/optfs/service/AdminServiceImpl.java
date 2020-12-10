package com.cg.optfs.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.cg.optfs.dao.AdminDAO;
import com.cg.optfs.dao.AdminDAOImpl;
import com.cg.optfs.entity.Admin;
import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.Tutor;

public class AdminServiceImpl implements AdminService{
	final static Logger logger = Logger.getLogger(AdminServiceImpl.class);
	AdminDAO adao;

	
	public AdminServiceImpl() {

	adao= new AdminDAOImpl();
	}
	@Override
	public boolean loginAdmin(String username, String password) {
		logger.info("Admin Service started");
		return adao.loginAdmin(username, password);
	}
	
	@Override
	public List<org.hibernate.annotations.Parent> viewParent() {
		
		return adao.viewParent();
	}
	
	@Override
	public Tutor addTutor(Tutor tutor) {
		
		return adao.addTutor(tutor);
	}
	
	@Override
	public Admin logout() {
		// TODO Auto-generated method stub
		return adao.logout();
	}
	
	
	
	/*@Override
	public Tutor manageTutor(Tutor tutor) {
		// TODO Auto-generated method stub
		return adao.manageTutor(tutor);
	}

	@Override
	public Parent viewParent(Parent parent) {
		// TODO Auto-generated method stub
		return adao.viewParent(parent);
	}

	@Override
	public Ebook manageEbooks(Ebook ebook) {
		// TODO Auto-generated method stub
		return adao.manageEbooks(ebook);
	}*/

	

}