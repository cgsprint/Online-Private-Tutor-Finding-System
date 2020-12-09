package com.cg.optfs.dao;

import java.util.List;

import org.hibernate.annotations.Parent;

public interface AdminDAO {
	
	//public boolean manageTutor(Tutor tutor);
	public List<Parent> viewParent(Parent parent);
	//public boolean manageEbooks(Ebook ebook);
	
	

}
