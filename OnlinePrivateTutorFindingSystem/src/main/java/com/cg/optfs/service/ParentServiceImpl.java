package com.cg.optfs.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.cg.optfs.dao.EbookDAO;
import com.cg.optfs.dao.EbookDAOImpl;
import com.cg.optfs.dao.ParentDAO;
import com.cg.optfs.dao.ParentDAOImpl;
import com.cg.optfs.dao.RequestDAO;
import com.cg.optfs.dao.RequestDAOImpl;
import com.cg.optfs.dao.TutorDAO;
import com.cg.optfs.dao.TutorDAOImpl;
import com.cg.optfs.entity.Ebook;
import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.ParentTO;
import com.cg.optfs.entity.Request;
import com.cg.optfs.entity.RequestTO;
import com.cg.optfs.entity.Tutor;

public class ParentServiceImpl implements ParentService {
	final static Logger logger = Logger.getLogger(ParentServiceImpl.class);
	ParentDAO pdao;
	TutorDAO tdao;
	EbookDAO edao;
	RequestDAO rdao;
	public ParentServiceImpl(){
		pdao=new ParentDAOImpl();
		tdao = new TutorDAOImpl();
		edao = new EbookDAOImpl();
		rdao = new RequestDAOImpl();
	}
	
	@Override
	public Parent updateParent(Parent parent) {
		// TODO Auto-generated method stub
		logger.info("Parent updateParent service started");
		return pdao.updateParent(parent);
	}
	@Override
	public List<Parent> viewAllParents() {
		// TODO Auto-generated method stub
		logger.info("Parent listParent service started");
		return pdao.viewAllParents();
	}
	@Override
	public boolean loginParent(String username, String password) {
		logger.info("Parent login service started");
		return pdao.loginParent(username, password);
	}
	@Override
	public Parent addParent(ParentTO parentto) {
		logger.info("Parent addParent service started");
		Parent parent = new Parent(parentto.getFirstName(),parentto.getLastName(),parentto.getUsername(),parentto.getPassword(),parentto.getMobileNo(),parentto.getEmail(),parentto.getAddress());
		return pdao.addParent(parent);
	}

	@Override
	public List<Tutor> viewTutor(String p_username) {
		
		String addr = pdao.getAddress(p_username);
		return tdao.viewTutor(addr);
	}

	@Override
	public List<Ebook> viewEbook() {
		
		
		return edao.viewEbook();
	}

	@Override
	public Parent getParent(String p_username1) {
		
		
		return pdao.getParent(p_username1);
	}

	@Override
	public Request requestDemo(RequestTO requestto) {
		
		Request request = new Request(requestto.getParentId(),requestto.getTutorId(),requestto.getSubject(),requestto.getDate(),requestto.getTime());
		return rdao.requestDemo(request);
	}

	@Override
	public void logout() {
		System.exit(0);
		
	}
	
}
