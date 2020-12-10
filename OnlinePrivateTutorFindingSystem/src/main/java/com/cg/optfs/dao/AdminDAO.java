package com.cg.optfs.dao;

import java.util.List;

import org.hibernate.annotations.Parent;

import com.cg.optfs.entity.Admin;
import com.cg.optfs.entity.Tutor;
//import com.cg.optfs.entity.Tutor;

public interface AdminDAO {
	
	public boolean loginAdmin(String username,String password);
	public Tutor addTutor(Tutor tutor);
	public List<Parent> viewParent();
//	public Ebook addEbook(Ebook ebook);
	public Admin logout();
	
	

}
