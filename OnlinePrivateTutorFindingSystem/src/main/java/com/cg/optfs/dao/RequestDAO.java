package com.cg.optfs.dao;

import java.util.List;

import com.cg.optfs.entity.Request;


public interface RequestDAO {
	public List<Request> viewRequest(int tutorid);

	public Request requestDemo(Request request);
}
