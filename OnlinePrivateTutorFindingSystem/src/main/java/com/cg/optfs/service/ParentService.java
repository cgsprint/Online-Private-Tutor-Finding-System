package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.Request;

public interface ParentService {
	public Parent addParent(Parent parent);
	public Parent updateParent(Parent parent);
	public List<Parent> viewAllParents();
	public Request requestDemo(Request request);
}
