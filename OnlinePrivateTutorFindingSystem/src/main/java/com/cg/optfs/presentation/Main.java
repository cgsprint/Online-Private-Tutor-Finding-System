package com.cg.optfs.presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.cg.optfs.entity.Ebook;
import com.cg.optfs.entity.EbookTO;
import com.cg.optfs.entity.Parent;
import com.cg.optfs.entity.ParentTO;
import com.cg.optfs.entity.Request;
import com.cg.optfs.entity.RequestTO;
import com.cg.optfs.entity.Tutor;
import com.cg.optfs.entity.TutorTO;
//import com.cg.optfs.exception.NullPointerException;
import com.cg.optfs.exception.RuntimeException;
import com.cg.optfs.service.AdminAuthImplService;
import com.cg.optfs.service.AdminAuthService;
import com.cg.optfs.service.AdminService;
import com.cg.optfs.service.AdminServiceImpl;
import com.cg.optfs.service.EbookService;
import com.cg.optfs.service.EbookServiceImpl;
import com.cg.optfs.service.ParentService;
import com.cg.optfs.service.ParentServiceImpl;
import com.cg.optfs.service.RequestService;
import com.cg.optfs.service.RequestServiceImpl;
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
		RequestService rs = new RequestServiceImpl();
		
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
                
				 try
					{
					if(username.equals("") || password.equals(""))
					
						throw new NullPointerException();
					else if(password.length()<8) 
						throw new Exception();
					
				}catch(NullPointerException e)
					{
						System.out.println("Please enter valid username and password "+e);
						
						System.out.println("Enter the username:");

						 username = sc.next();
						
						System.out.println("Enter the password:");
						
						 password = sc.next();
					}catch(Exception e) {
						System.out.println("Please enter password of more than 8 charachters "+e);
						
						System.out.println("Enter the username:");

						 username = sc.next();
						
						System.out.println("Enter the password:");
						
						 password = sc.next();
					}
			
				
				
				
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
				  			System.out.println("Enter username: ");
				  			String username1=sc.next();
				  			
				  			System.out.println("Enter password: ");
				  		    String pass=sc.next();

				  			
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
						 	
									
						 	
						 	TutorTO tutorto = new TutorTO(name, subject, phoneno, addr, qualification,username1,pass);
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
							System.out.println("4. Logout");
							
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
							
							System.out.println("1. Register Tutor");
							System.out.println("2. View parents");
							System.out.println("3. Add ebooks");
							System.out.println("4. Logout");
							
							System.out.println("Enter the choice number:");
							choice = sc.nextInt(); 
						  	break;
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
				
				System.out.println("Enter the username:");

				String t_username = sc.next();
				
				System.out.println("Enter the password:");
				String t_password = sc.next();
				
				boolean tutor_res = ts.loginTutor(t_username, t_password);
				
				if(tutor_res)
				{
					Tutor tutor=ts.getTutor(t_username);
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
							
//							List<Request> rlst = ts.viewRequest(request, tutorid)
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
				}
				else
				{
					System.out.println("Invalid Credentials for tutor");
					
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
						String regex="^[_|a-zA-Z][0-9]+@[.a-zA-Z]{2,4}$";
						try {
							
							if(first_name.equals("") && last_name.equals("") && uname.equals("") && pass.equals("") && mobileno.equals("") && addr.equals("") && email.equals("")) {
								throw new NullPointerException();
								
							}else if(!email.matches(regex)) {
								throw new RuntimeException();
								
							}
						}catch(NullPointerException e) {
							System.out.println("All the information has to be filled"+e);
						}catch(RuntimeException e) {
							System.out.println("Enter correct Email "+e);
						}

						ParentTO parentto = new ParentTO(first_name, last_name, uname, pass, mobileno, email, addr);
						Parent pt = ps.addParent(parentto);
						//ps.addParent(parentto);
						
						logger.info("Parent addParent Dao stopped");
						logger.info("Parent addParent Service stopped");
						System.out.println("You registered succesfully.");
						
						/*
						 * System.out.println("1. Register"); System.out.println("2. Login");
						 * System.out.println("Enter the choice number: ");
						 * 
						 * parent_choice = sc.nextInt();
						
						 

						
						  System.out.println("Enter Username: ");
						  String p_username = sc.next();
						  System.out.println("Enter Password: "); 
						  String p_password = sc.next();
						  
						  boolean result = ps.loginParent(p_username, p_password);
						  System.out.println("parent is "+result);
						   */
						 
					case 2:
						System.out.println("Enter Username: ");
						String p_username1 = sc.next();
						System.out.println("Enter Password: ");
						String p_password1 = sc.next();
						 try
							{
							if(p_username1.equals("") || p_password1.equals(""))
							
								throw new NullPointerException();
							else if(p_password1.length()<8) 
								throw new Exception();
							
						}catch(NullPointerException e)
							{
								System.out.println("Please enter valid username and password "+e);
								
								System.out.println("Enter Username: ");
								 p_username1 = sc.next();
								System.out.println("Enter Password: ");
								 p_password1 = sc.next();
							}catch(Exception e) {
								System.out.println("Please enter password of more than 8 charachters "+e);
								System.out.println("Enter Username: ");
							    p_username1 = sc.next();
								System.out.println("Enter Password: ");
								 p_password1 = sc.next();
							}
					

						boolean result1 = ps.loginParent(p_username1, p_password1);
						if(result1 == true)
						{
							logger.info("Parent login Dao stopped");
							logger.info("Parent login Service stopped");
							  System.out.println("1. View Tutor"); 
							  System.out.println("2. View Bookings");
							  System.out.println("3. View Ebook");
							  System.out.println("4. Request Demo(Choose the View Tutor first)");
							  System.out.println("5. Logout");
							  
							  System.out.println("Enter the choice number: ");
							  
							  int parent_choice2 = sc.nextInt();
							  
							  while(true)
							  {
							  switch(parent_choice2)
							  {
							  	case 1:
							  		
							  		List<Tutor> tutor = ps.viewTutor(p_username1);
							  		
							  		System.out.println();
									Iterator i =  tutor.iterator();
									
									System.out.println("=============================== List of tutors near you ==============================");
									while(i.hasNext())
									{
										System.out.println(i.next());
									}
									
									System.out.println();
									  System.out.println("1. View Tutor"); 
									  System.out.println("2. View Bookings");
									  System.out.println("3. View Ebook");
									  System.out.println("4. Request Demo(Choose the View Tutor first)");
									  System.out.println("5. Logout");
									  
									  
									System.out.println("Enter the choice number: ");
									  
									parent_choice2 = sc.nextInt();
									break;
									
							  	case 2: 
							  		System.out.println("View Bookings");
							  		break;
							  	case 3:
//							  		System.out.println("View Ebooks");
							  		
									
									  List<Ebook> elst = ps.viewEbook(); 
//									  System.out.println(elst);
									 
									
									
									
									  Iterator i1 = elst.iterator();
									  
									  while(i1.hasNext())
									  { 
										  System.out.println(i1.next());
									  }
									 
									 
									 
							  		System.out.println();
							  		System.out.println("1. View Tutor"); 
							  		System.out.println("2. View Bookings");
							  		System.out.println("3. View Ebook");
							  		System.out.println("4. Request Demo(Choose the View Tutor first)");
							  		System.out.println("5. Logout");
								  
									  
									System.out.println("Enter the choice number: ");
									  
									parent_choice2 = sc.nextInt();
									break;
							  	case 4:
							  		
							  		Parent parent= ps.getParent(p_username1);
							  		System.out.println("Enter the tutor id to request demo: ");
							  		int tutor_id = sc.nextInt();
							  		System.out.println("Enter the subject: ");
							  		String subject = sc.next();
							  		System.out.println("Enter the date in DD/MM/YYYY format: ");
							  		String date =sc.next();
							  		System.out.println("Enter the time in HH:MM format(24 hours): ");
							  		String time =sc.next();
							  		
							  		RequestTO requestto = new RequestTO(parent.getParentId(),tutor_id,subject,date,time);
							  		
							  		ps.requestDemo(requestto);
							  		System.out.println("Request sent ");
							  		System.out.println();
							  		System.out.println("1. View Tutor"); 
							  		System.out.println("2. View Bookings");
							  		System.out.println("3. View Ebook");
							  		System.out.println("4. Request Demo(Choose the View Tutor first)");
							  		System.out.println("5. Logout");
								  
									  
									System.out.println("Enter the choice number: ");
									  
									parent_choice2 = sc.nextInt();
									break;
							  	case 5:
							  		ps.logout();
							  		break;
							  	default:
							  		System.out.println("Invalid choice");
							  		break;
									
							  	}
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
