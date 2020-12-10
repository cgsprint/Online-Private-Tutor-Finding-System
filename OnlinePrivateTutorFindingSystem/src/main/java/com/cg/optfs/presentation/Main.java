package com.cg.optfs.presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.cg.optfs.entity.Ebook;
import com.cg.optfs.entity.EbookTO;
import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.ParentTO;
import com.cg.optfs.entity.TutorTO;
import com.cg.optfs.service.AdminAuthImplService;
import com.cg.optfs.service.AdminAuthService;
import com.cg.optfs.service.AdminService;
import com.cg.optfs.service.AdminServiceImpl;
import com.cg.optfs.service.EbookService;
import com.cg.optfs.service.EbookServiceImpl;
import com.cg.optfs.service.ParentService;
import com.cg.optfs.service.ParentServiceImpl;
import com.cg.optfs.service.TutorService;
import com.cg.optfs.service.TutorServiceImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Main.class);
		AdminAuthService aa = new AdminAuthImplService();
		AdminService as = new AdminServiceImpl();
		ParentService ps = new ParentServiceImpl();
		TutorService ts = new TutorServiceImpl();
		EbookService es = new EbookServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		logger.info("Main started");
		System.out.println("1. Admin");
		System.out.println("2. Tutor");
		System.out.println("3. Parent");
		System.out.println("Select your role choice number:");
		
		int role = sc.nextInt();
		
		switch(role)
		{
			case 1:
				
				
				System.out.println("Enter the username:");

				String username = sc.next();
				
				System.out.println("Enter the password:");
				String password = sc.next();
				
				boolean res = as.loginAdmin(username, password);
				logger.info("Admin login Dao stopped");
				logger.info("Admin login Service stopped");
				if(res)
				{ 
					System.out.println("1. Register Tutor");
					System.out.println("2. View parents");
					System.out.println("3. Add ebooks");
					System.out.println("4. Logout");
					
					System.out.println("Enter the choice number:");
					int choice = sc.nextInt(); 
					
					while(true)
					{
						
				  	switch(choice) 
				  	{ 
				  		case 1:
				  			
				  			System.out.println("Enter Name: ");
//							tutor.setName(sc.next());
				  			String name = sc.next();
//							sc.next();
							System.out.println("Enter Subject: ");
//						  	tutor.setSubject(sc.next());
							String subject = sc.next();
//						  	sc.nextLine();
							System.out.println("Enter Phone no : ");
//						  	tutor.setPhonenumber(sc.next());
							String phoneno = sc.next();
						  	
//						  	sc.nextLine();
						 	System.out.println("Enter address: ");
//						 	tutor.setAddress(sc.next());
						 	String addr = sc.next();
						 	
						 	System.out.println("Enter Qualification: ");
//						 	tutor.setQualification(sc.next());
						 	String qualification = sc.next();
						 	
						 	TutorTO tutorto = new TutorTO(name, subject, phoneno, addr, qualification);
//						 	Tutor tut = as.addTutor(tutor);
						 	as.addTutor(tutorto);
						 	logger.info("Tutor addTutor Dao stopped");
							logger.info("Admin addTutor Service stopped");
						 	
						 	System.out.println("Tutor registered succefully...");
						 	
						 	System.out.println("1. Register Tutor");
							System.out.println("2. View parents");
							System.out.println("3. Add ebooks");
							System.out.println("4. Logout");
							
							System.out.println("Enter the choice number:");
							choice = sc.nextInt(); 
						  	break;
						  	
						  	
						case 2:
							System.out.println("View parents");
							/*
							 * List<org.hibernate.annotations.Parent> lp = as.viewParent();
							 * System.out.println(lp);
							 */
							List<Parent> plst = as.viewParent();
							logger.info("Parent listParent Dao stopped");
							logger.info("Admin listParent Service stopped");
							System.out.println();
							Iterator i = plst.iterator();
							
							System.out.println("=============================== List of parents ==============================");
							while(i.hasNext())
							{
								System.out.println(i.next());
							}
							
							System.out.println();
							
							System.out.println("1. Register Tutor");
							System.out.println("2. View parents");
							System.out.println("3. Add ebooks");
							System.out.println("3. Logout");
							
							System.out.println("Enter the choice number:");
							choice = sc.nextInt(); 
						  	break;
						case 3:
//							Ebook ebook = new Ebook();
							
							System.out.println("Enter Title: ");
							String title =sc.next();
							sc.nextLine();
							System.out.println("Enter Author: ");
							String author = sc.nextLine();
//							sc.next();
							System.out.println("Enter URL:");
							String url = sc.nextLine();
//							sc.next();
							
							EbookTO ebookto = new EbookTO(title, author, url);
							as.addEbook(ebookto);
							logger.info("Ebook addEbook Dao stopped");
							logger.info("Admin addEbook Service stopped");
							
							System.out.println("Ebook added");
						case 4:
							as.logout();
							break;
						  			
					}
					}
				}
				else
				{
					System.out.println("Invalid credentials..");
				}
						
				break;	
				
			case 2:
				// Code for Tutor
				
				System.out.println("1. View Demo requests");
				System.out.println("2. View Bookings");
				System.out.println("3. Update profile");
				System.out.println("Enter the choice number: ");
				
				int tutor_choice = sc.nextInt();
				
				switch(tutor_choice)
				{
					case 1:
						//View demo request code
						System.out.println("View Demo request");
						break;
					case 2:
						//View Bookings
						System.out.println("View Bookings");
						break;
					case 3:
						//Update profile
						System.out.println("Update profile");
						break;
					default:
						System.out.println("Invalid choice");
						break;
						
				}
				break;
			case 3:
				//Code for parent
				System.out.println("1. Register");
				System.out.println("2. Login");
				System.out.println("Enter the choice number: ");
				
				int parent_choice = sc.nextInt();
				
				switch(parent_choice)
					{
					case 1:
//						Parent parent = new Parent();

						System.out.println("Enter first name: ");
						String first_name = sc.next();
						System.out.println("Enter last name: ");
//						parent.setLastName(sc.next());
						String last_name = sc.next();
						System.out.println("Enter Username: ");
//						parent.setUsername(sc.next());
						String uname = sc.next();
						System.out.println("Enter Password: ");
//						parent.setPassword(sc.next());
						String pass = sc.next();
						System.out.println("Enter Mobile no: ");
//						parent.setMobileNo(sc.next());
						String mobileno = sc.next();
						System.out.println("Enter Email: ");
//						parent.setEmail(sc.next());
						String email = sc.next();
						System.out.println("Enter Address: ");
//						parent.setAddress(sc.next());
						String addr = sc.next();

						ParentTO parentto = new ParentTO(first_name, last_name, uname, pass, mobileno, email, addr);
//						Parent pt = ps.addParent(parent);
						ps.addParent(parentto);
						logger.info("Parent addParent Dao stopped");
						logger.info("Parent addParent Service stopped");
						System.out.println("You registered succesfully.");
						
						/*
						 * System.out.println("1. Register"); System.out.println("2. Login");
						 * System.out.println("Enter the choice number: ");
						 * 
						 * parent_choice = sc.nextInt();
						 */

						/*
						 * System.out.println("Enter Username: "); String p_username = sc.next();
						 * System.out.println("Enter Password: "); String p_password = sc.next();
						 * 
						 * boolean result = ps.loginParent(p_username, p_password);
						 * System.out.println("parent is "+result);
						 */
					case 2:
						System.out.println("Enter Username: ");
						String p_username = sc.next();
						System.out.println("Enter Password: ");
						String p_password = sc.next();

						boolean result = ps.loginParent(p_username, p_password);
						if(result == true)
						{
							logger.info("Parent login Dao stopped");
							logger.info("Parent login Service stopped");
							  System.out.println("1. View Tutor"); 
							  System.out.println("2. View Bookings");
							  System.out.println("3. Logout");
							  
							  System.out.println("Enter the choice number: ");
							  
							  int parent_choice2 = sc.nextInt();
							  
							  switch(parent_choice2)
							  {
							  	case 1:
							  		
							  }
						}
						else
						{
							System.out.println("Invalid parent");
						}
						
						
						break;

					}
				break;
				
				
			
				
				
			default: 
				System.out.println("Invalid choice");
				break;
				  
		}
		
			
		}
	}

