package com.cg.optfs.dao;

import java.util.List;

import com.cg.optfs.entity.Ebook;
public interface EbookDAO {
	public Ebook addEbooks(Ebook ebook);
	public Ebook updateEbook(Ebook ebook);
	public List<Ebook> viewEbook(String title);
}
