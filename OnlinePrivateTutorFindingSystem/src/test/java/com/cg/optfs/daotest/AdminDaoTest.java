package com.cg.optfs.daotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.cg.optfs.dao.AdminDAO;
import com.cg.optfs.dao.AdminDAOImpl;
import com.cg.optfs.dao.TutorDAOImpl;
import com.cg.optfs.entity.Admin;
import com.cg.optfs.entity.Tutor;

public class AdminDaoTest {
   AdminDAO adao;
  @Before
   public void init(){
  	 adao= new AdminDAOImpl();
   }
   @Test
  public void addTutor() {
   	Tutor tutor = new Tutor();
		tutor.setName("Abc");
		tutor.setSubject("xyz");
		tutor.setPhonenumber("7040760465");
		tutor.setAddress("Bhiwandi");
		tutor.setQualification("Bsc");
		Tutor tobj = adao.addTutor(tutor);
		assertEquals("Bsc", tobj.getQualification());
	}
   @Test
   public void loginTest() {
	   Admin admin=new Admin();
	   boolean tobj = adao.loginAdmin("man43", "manoj435");
		assertTrue(tobj);
		//Comment
   }
    
   

   
}
