package com.cg.optfs.service;

import java.util.List;

import com.cg.optfs.entity.Ebook;

public interface EbookService {
	
	public Ebook addEbooks(Ebook ebook);
	public Ebook updateEbook(Ebook ebook);
	public List<Ebook> viewEbook(String title);
}
