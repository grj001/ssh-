package com.zhiyou100.struts.utils;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateUtil {
	
	private static final SessionFactory FACTORY;
	
	static {
		Configuration cfg = new Configuration().configure();
		//表结构被创建出来,比较好资源
		FACTORY = cfg.buildSessionFactory();
	}

	public static Session openSession(){
		
		return FACTORY.openSession();
	}
	
	public static Session getCurrentSession(){
		
		return FACTORY.getCurrentSession();
	}
}
