package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.dao.ParentDAO;
import com.cg.optfs.dao.ParentDAOImpl;
import com.cg.optfs.entity.Parent;

public class ParentServiceImpl implements ParentService {
	ParentDAO pdao;
	public ParentServiceImpl() {
		pdao=new ParentDAOImpl();
	}
}
