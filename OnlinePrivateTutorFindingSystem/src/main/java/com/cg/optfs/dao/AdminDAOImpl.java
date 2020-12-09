package com.cg.optfs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.annotations.Parent;

import com.cg.optfs.entity.Admin;
import com.cg.optfs.entity.LoginInfo;
import com.cg.optfs.utils.DbUtil;

public class AdminDAOImpl implements AdminDAO{

	EntityManager emanager;	
	public  AdminDAOImpl() {
		// TODO Auto-generated constructor stub
		emanager= DbUtil.getConnection();
	}

	/*
	@Override
	public List<Parent> viewParent(Parent parent) {
		TypedQuery<Parent> query=emanager.createQuery("select p.parent from Parent p where p.type=:abc",Parent.class);
//		query.setParameter("abc", type);
		List<Parent> list=query.getResultList();
		return list;
	}

	
	 * @Override public boolean manageEbooks(Ebook ebook) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * @Override public boolean manageTutor(Tutor tutor) { // TODO Auto-generated
	 * method stub return false; }
	 */
	
	/*
	 * @Override public boolean loginAdmin(String username,String password) {
	 * 
	 * TypedQuery<LoginInfo> query=emanager.
	 * createQuery("select cc.password from LoginInfo cc where cc.username=:username"
	 * ,LoginInfo.class); query.setParameter("username",username);
	 * System.out.println(query); String pass=query.getSingleResult().toString();
	 * if(password.equals(pass)) { return true; } return false; }
	 */

}
