package com.zhiyou100.struts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.struts.dao.UserDao;
import com.zhiyou100.struts.model.User;
import com.zhiyou100.struts.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao ud;
	
	@Override
	public void userRegist(User u) {
		ud.userRegist(u);	
	}

	@Override
	public User userLogin(User u) {
		User user = ud.userlogin(u);
		return user;
	}

}
