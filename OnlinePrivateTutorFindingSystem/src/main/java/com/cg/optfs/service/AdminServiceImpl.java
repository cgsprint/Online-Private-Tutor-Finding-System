package com.cg.optfs.service;

import com.cg.optfs.dao.AdminDAO;
import com.cg.optfs.dao.AdminDAOImpl;

public class AdminServiceImpl implements AdminService{

	AdminDAO adao;

	
	public AdminServiceImpl() {

	adao= new AdminDAOImpl();
	}
	@Override
	public boolean loginAdmin(String username, String password) {
		return adao.loginAdmin(username, password);
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
