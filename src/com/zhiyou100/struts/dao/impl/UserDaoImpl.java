package com.zhiyou100.struts.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.zhiyou100.struts.dao.UserDao;
import com.zhiyou100.struts.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void userRegist(User u) {
		getHibernateTemplate().save(u);
	}

	@Override
	public User userlogin(User u) {
		List<User> list = getHibernateTemplate().findByExample(u);
		//System.out.println("***\n" + list +"\n***");
		return list.get(0);
	}

}
