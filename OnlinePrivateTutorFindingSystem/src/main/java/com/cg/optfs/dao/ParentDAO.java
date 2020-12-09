package com.cg.optfs.dao;

import java.util.List;

import com.cg.optfs.entity.Parent;

public interface ParentDAO {
	public Parent addParent(Parent parent);
	public Parent updateParent(Parent parent);
	public List<Parent> viewAllParents();
}
