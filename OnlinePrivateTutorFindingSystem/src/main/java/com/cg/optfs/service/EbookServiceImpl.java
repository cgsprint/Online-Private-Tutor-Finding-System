package com.cg.optfs.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.cg.optfs.dao.EbookDAO;
import com.cg.optfs.dao.EbookDAOImpl;
import com.cg.optfs.entity.Ebook;

public class EbookServiceImpl implements EbookService {
	final static Logger logger = Logger.getLogger(EbookServiceImpl.class);
      EbookDAO edao;
      public EbookServiceImpl() {
    	  edao=new EbookDAOImpl();
      }
	@Override
	public Ebook addEbooks(Ebook ebook) {
		// TODO Auto-generated method stub
		
		return edao.addEbooks(ebook);
	}

	@Override
	public Ebook updateEbook(Ebook ebook) {
		// TODO Auto-generated method stub
		return edao.updateEbook(ebook);
	}

	@Override
	public List<Ebook> viewEbook(String title) {
		// TODO Auto-generated method stub
		return edao.viewEbook(title);
	}
	

}
