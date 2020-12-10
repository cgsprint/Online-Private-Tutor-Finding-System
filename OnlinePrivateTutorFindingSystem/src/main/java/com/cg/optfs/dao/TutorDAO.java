package com.cg.optfs.dao;
import com.cg.optfs.entity.*;
import java.util.List;

import com.cg.optfs.entity.Tutor;

public interface TutorDAO {
	 public Tutor updateProfile(Tutor tutor);
     public List<Request> ViewRequest(Request request,int tutorid);
     public List<BookedTutor> ViewBookings(BookedTutor booking,int tutorid);

}
