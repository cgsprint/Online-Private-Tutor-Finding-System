package com.cg.optfs.presentation;

import java.util.Iterator;

import java.util.List;
import java.util.Scanner;

import com.cg.optfs.entity.LoginInfo;
import com.cg.optfs.entity.Parent;
import com.cg.optfs.service.AdminAuthImplService;
import com.cg.optfs.service.AdminAuthService;
import com.cg.optfs.service.AdminService;
import com.cg.optfs.service.AdminServiceImpl;

public class Main {

	public static void main(String[] args) {

		AdminAuthService aa = new AdminAuthImplService();
		AdminService as = new AdminServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("Enter the choice number:");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			LoginInfo li = new LoginInfo();
			
			
			System.out.println("Enter the username:");
//			li.setUsername(sc.next());
			String username = sc.next();
			
			System.out.println("Enter the password:");
//			li.setPassword(sc.next());
			String password = sc.next();
			
//			boolean admin = aa.loginAdmin(username, password);
//			boolean admin = aa.loginAdmin(li);
			boolean res = as.loginAdmin(username, password);
			
//			System.out.println(res);
			
			  if(res)
			  { 
				  System.out.println("1. Register Tutor");
			  System.out.println("2. View parents");
			  System.out.println("Enter the choice number:");
			  
			  choice = sc.nextInt(); 
			  	switch(choice) 
			  	{ 
			  		case 1:
//			  			Tutor tu = new Tutor();
			  			
			  			System.out.println("Enter tutor name: ");
			  			
				  
			  			break;
			  		case 2:
			  		
			  			
			  			List<org.hibernate.annotations.Parent> lp = as.viewParent();
			  			
			  			System.out.println(lp);
			  			
			  			
			  	}
			  }
			  else
			  {
				  System.out.println("Invalid credentials..");
			  }
			 
			
			
			break;
		}
	}

}
