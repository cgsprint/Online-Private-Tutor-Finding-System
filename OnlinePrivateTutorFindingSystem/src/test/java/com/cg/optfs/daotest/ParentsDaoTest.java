package com.cg.optfs.daotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cg.optfs.dao.ParentDAO;
import com.cg.optfs.dao.ParentDAOImpl;
import com.cg.optfs.entity.Parent;

public class ParentsDaoTest {
	 ParentDAO pdao;
	  @Before
	  public void init() {
		  pdao=new ParentDAOImpl();
	  }
	  @Test
	  public void addParentTest() {
		  Parent parent=new Parent();
		  parent.setFirstName("Manoj");
		  parent.setLastName("Chaudhary");
		  parent.setAddress("Thane");
		  parent.setEmail("manjc3@gmail.com");
		  parent.setMobileNo("7040760465");
		  parent.setUsername("man43");
		  parent.setPassword("manoj435");
		  Parent obj=pdao.addParent(parent);
		  assertEquals("manjc3@gmail.com",obj.getEmail());
	  }
	  @Test
	  public void loginParentTest() {
		  Parent parent=new Parent();
		  boolean boln=pdao.loginParent("man43", "manoj435");
		  assertTrue(boln);
	  }
	  @Ignore
	  @Test
	  public void getAddressTest() {
		  Parent parent=new Parent();
		  parent.setAddress("Thane");
		  parent.setUsername("man43");
		  String name=pdao.getAddress("man43");
		  assertEquals("Thane",name);
		  
	  }
}
