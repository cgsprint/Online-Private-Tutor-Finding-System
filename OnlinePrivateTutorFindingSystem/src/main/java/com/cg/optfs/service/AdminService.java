package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.entity.Admin;
import com.cg.optfs.entity.Ebook;
import com.cg.optfs.entity.EbookTO;
import com.cg.optfs.entity.Tutor;
import com.cg.optfs.entity.TutorTO;


//import com.cg.optfs.entity.Parent;

public interface AdminService {
	
	/*
	 * public Tutor manageTutor(Tutor tutor); 
	 * public Parent viewParent(Parent parent); 
	 * public Ebook manageEbooks(Ebook ebook);
	 */
	
	public boolean loginAdmin(String username,String password);
	public List<com.cg.optfs.entity.Parent> viewParent();
	public Admin logout();
	public Tutor addTutor(TutorTO tutorto);
	public Ebook addEbook(EbookTO ebookto);
	
}
