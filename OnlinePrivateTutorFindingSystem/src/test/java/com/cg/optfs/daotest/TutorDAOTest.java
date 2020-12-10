package com.cg.optfs.daotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.cg.optfs.dao.TutorDAO;
import com.cg.optfs.dao.TutorDAOImpl;
import com.cg.optfs.entity.BookedTutor;
import com.cg.optfs.entity.Request;
import com.cg.optfs.entity.Tutor;



public class TutorDAOTest {
	Request request;
	BookedTutor bookings;
         TutorDAO tdao;
         @Before
         public void init() {
        	 tdao= new TutorDAOImpl();
         }
         @Ignore
         @Test
     	public void testviewRequest() {

     		List<Request> requestt = tdao.ViewRequest(request, request.getTutorId());
     		assertNotNull(requestt);
     	}

		
		 
		 @Ignore
		  @Test 
		  public void testViewBookings() { 
			  Tutor obj = new Tutor(); //
			  List<BookedTutor> book = tdao.ViewBookings(bookings,bookings.getTutorId());
	     		assertNotNull(book);
	     	}
		 
     	
     	@Test
     	public void testUpdateProfile()
     	{
     		Tutor tutor = new Tutor();
     		tutor.setName("Abc");
     		tutor.setSubject("xyz");
     		
     		tutor.setAddress("Dadar");
     		tutor.setPhonenumber("7040760465");
     		tutor.setQualification("Bsc.It");
     		
     		Tutor tobj = tdao.updateProfile(tutor);
     		assertEquals("7040760465", tobj.getPhonenumber());
     	}
         
         
}
