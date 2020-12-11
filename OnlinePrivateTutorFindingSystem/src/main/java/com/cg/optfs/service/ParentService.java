package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.entity.Ebook;
import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.ParentTO;
import com.cg.optfs.entity.Request;
import com.cg.optfs.entity.RequestTO;
import com.cg.optfs.entity.Tutor;

public interface ParentService {
	public Parent addParent(ParentTO parentto);
	public Parent updateParent(Parent parent);
	public List<Parent> viewAllParents();
	public Request requestDemo(RequestTO requestto);
	public boolean loginParent(String p_username, String p_password);
	public List<Tutor> viewTutor(String p_username);
	public List<Ebook> viewEbook();
	public Parent getParent(String p_username1);
	public void logout();
}
