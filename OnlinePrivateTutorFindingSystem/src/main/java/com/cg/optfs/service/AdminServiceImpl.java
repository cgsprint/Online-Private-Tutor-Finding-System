package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.dao.AdminDAO;
import com.cg.optfs.dao.AdminDAOImpl;
import com.cg.optfs.entity.Parent;

public class AdminServiceImpl implements AdminService{

	AdminDAO adao;

	
	public AdminServiceImpl() {

	adao= new AdminDAOImpl();
	}
	@Override
	public boolean loginAdmin(String username, String password) {
		return adao.loginAdmin(username, password);
	}
	@Override
	public List<org.hibernate.annotations.Parent> viewParent(int parentId) {
		
		return adao.viewParent(parentId);
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
