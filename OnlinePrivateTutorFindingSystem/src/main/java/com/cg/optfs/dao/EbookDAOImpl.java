package com.cg.optfs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import com.cg.optfs.entity.Ebook;
import com.cg.optfs.entity.Parent;
import com.cg.optfs.utils.DbUtil;
public class EbookDAOImpl implements EbookDAO {

	EntityManager emanager;
	public EbookDAOImpl() {
		emanager= DbUtil.getConnection();
	}
	@Override
	public Ebook addEbooks(Ebook ebook) {
		emanager.getTransaction().begin();
		emanager.persist(ebook);
		emanager.getTransaction().commit();
		return ebook;
	}

	@Override
	public Ebook updateEbook(Ebook ebook) {
		emanager.merge(ebook);
		return ebook;
	}

	@Override
	public List<Ebook> viewEbook(String title) {
		
		TypedQuery<Ebook> query=emanager.createQuery("select cc.Book from Ebook cc where cc.title=:title",Ebook.class);
		query.setParameter("title", title);
		List<Ebook> list=query.getResultList();
		return list;
	}
	@Override
	public List<Ebook> viewEbook() {
		
		Query query =emanager.createQuery("from Ebook");
		 List<Ebook> arr_cust =query.getResultList(); 
		 return arr_cust;
		
	}
}
