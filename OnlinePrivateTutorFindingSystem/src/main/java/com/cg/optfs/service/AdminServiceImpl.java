package com.cg.optfs.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.cg.optfs.dao.AdminDAO;
import com.cg.optfs.dao.AdminDAOImpl;
import com.cg.optfs.dao.EbookDAO;
import com.cg.optfs.dao.EbookDAOImpl;
import com.cg.optfs.dao.ParentDAO;
import com.cg.optfs.dao.ParentDAOImpl;
import com.cg.optfs.entity.Admin;
import com.cg.optfs.entity.Ebook;
import com.cg.optfs.entity.EbookTO;
import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.Tutor;
import com.cg.optfs.entity.TutorTO;

public class AdminServiceImpl implements AdminService{
	final static Logger logger = Logger.getLogger(AdminServiceImpl.class);
	AdminDAO adao;
	ParentDAO pdao;
	EbookDAO edao;

	
	public AdminServiceImpl() {

	adao= new AdminDAOImpl();
	pdao = new ParentDAOImpl();
	edao = new EbookDAOImpl();
	}
	/*
	 * public AdminServiceImpl() {
	 * 
	 * pdao= new ParentDAOImpl(); }
	 */
	
	@Override
	public boolean loginAdmin(String username, String password) {
		logger.info("Admin login Service started");
		return adao.loginAdmin(username, password);
	}
	
	@Override
	public List<Parent> viewParent() {
		logger.info("Admin viewParent service started");
		return pdao.viewAllParents();
	}
	
	@Override
	public Tutor addTutor(TutorTO tutorto) {
		logger.info("Admin addTutor service started");
		Tutor tutor = new Tutor(tutorto.getName(),tutorto.getSubject(),tutorto.getPhonenumber(),tutorto.getAddress(),tutorto.getQualification());
		return adao.addTutor(tutor);
	}
	@Override
	public Admin logout() {
		logger.info("Admin logout service started");
		System.exit(0);
		return null;
	}

	@Override
	public Ebook addEbook(EbookTO ebookto) {
		logger.info("Admin addEbook service started");
		Ebook ebook = new Ebook(ebookto.getTitle(),ebookto.getAuthorname(),ebookto.getUrl());
		return edao.addEbooks(ebook);
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