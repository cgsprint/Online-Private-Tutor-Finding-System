package com.cg.optfs.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbUtil {

	private static EntityManager emanager;
	
	public static EntityManager getConnection()
	{
		if(emanager == null)
		{
			EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-PU");
			emanager = fac.createEntityManager();
		}
		return emanager;
	}

}
