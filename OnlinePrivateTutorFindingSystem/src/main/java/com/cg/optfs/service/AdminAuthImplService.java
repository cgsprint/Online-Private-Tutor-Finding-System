package com.cg.optfs.service;

import com.cg.optfs.dao.AdminDAO;
import com.cg.optfs.entity.LoginInfo;
import com.cg.optfs.presentation.Main;

public class AdminAuthImplService implements AdminAuthService{

	AdminDAO adao;
	Main mn = new Main();
	
	
	@Override
	public boolean loginAdmin(LoginInfo li) {
		
		
//		return 
		
		  if(li.getUsername().equals("tejas") && li.getPassword().equals("tejas123")) {
			  return true; 
		  }
		  
		  return false;
		 
	}

}
