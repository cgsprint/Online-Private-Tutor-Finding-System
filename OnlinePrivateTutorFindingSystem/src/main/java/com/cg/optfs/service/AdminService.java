package com.cg.optfs.service;

import java.util.List;

import org.hibernate.annotations.Parent;


//import com.cg.optfs.entity.Parent;

public interface AdminService {
	
	/*
	 * public Tutor manageTutor(Tutor tutor); 
	 * public Parent viewParent(Parent parent); 
	 * public Ebook manageEbooks(Ebook ebook);
	 */
	
	public boolean loginAdmin(String username,String password);
	public List<Parent> viewParent(int parentId);
	
}
