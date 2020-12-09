package com.cg.optfs.service;

import com.cg.optfs.dao.Ebook;
import com.cg.optfs.dao.Parent;
import com.cg.optfs.dao.Tutor;

public interface AdminService {
	
	/*
	 * public Tutor manageTutor(Tutor tutor); 
	 * public Parent viewParent(Parent parent); 
	 * public Ebook manageEbooks(Ebook ebook);
	 */
	
	public boolean loginAdmin(String username,String password);
	
	
}
