package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.dao.AdminDAO;
import com.cg.optfs.dao.AdminDAOImpl;
import com.cg.optfs.dao.ParentDAO;
import com.cg.optfs.dao.ParentDAOImpl;
import com.cg.optfs.entity.Admin;
import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.Tutor;

public class AdminServiceImpl implements AdminService{

	AdminDAO adao;
	ParentDAO pdao;

	
	public AdminServiceImpl() {

	adao= new AdminDAOImpl();
	pdao = new ParentDAOImpl();
	}
	/*
	 * public AdminServiceImpl() {
	 * 
	 * pdao= new ParentDAOImpl(); }
	 */
	
	@Override
	public boolean loginAdmin(String username, String password) {
		return adao.loginAdmin(username, password);
	}
	
	@Override
	public List<Parent> viewParent() {
		
		return pdao.viewAllParents();
	}
	
	@Override
	public Tutor addTutor(Tutor tutor) {
		
		return adao.addTutor(tutor);
	}
	@Override
	public Admin logout() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*@Override
	public Admin logout() {
		// TODO Auto-generated method stub
		return adao.logout();
	}*/
	
	
	
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