package com.cg.optfs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.annotations.Parent;

import com.cg.optfs.entity.Admin;
//import com.cg.optfs.entity.Tutor;
import com.cg.optfs.utils.DbUtil;

public class AdminDAOImpl implements AdminDAO{

	EntityManager emanager;	
	public  AdminDAOImpl() {
		// TODO Auto-generated constructor stub
		emanager= DbUtil.getConnection();
	}
	@Override
	public boolean loginAdmin(String username, String password) {
		
		if(username.equals("tejas") && password.equals("tejas123"))
		{
			return true;
		}
		return false;
	}

	/*
	 * @Override public Tutor addTutor(Tutor tutor) { // TODO Auto-generated method
	 * stub return null; }
	 */
	@Override
	public List<Parent> viewParent(int parentId) {
		TypedQuery<Parent> query= emanager.createQuery("select cc.parent from Parent cc where cc.parentId=:id",Parent.class);
		query.setParameter("id", parentId);
		List<Parent> list=query.getResultList();
		return list;
		
	}
	
	@Override
	public Admin logout(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * @Override public Ebook addEbook(Ebook ebook) { // TODO Auto-generated method
	 * stub return null; }
	 */
	
	

	

}
