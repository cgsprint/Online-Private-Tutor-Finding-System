package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.ParentTO;
import com.cg.optfs.entity.Request;

public interface ParentService {
	public Parent addParent(ParentTO parentto);
	public Parent updateParent(Parent parent);
	public List<Parent> viewAllParents();
	public Request requestDemo(Request request);
	public boolean loginParent(String p_username, String p_password);
}
