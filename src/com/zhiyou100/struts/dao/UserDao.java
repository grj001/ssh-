package com.zhiyou100.struts.dao;

import com.zhiyou100.struts.model.User;

public interface UserDao {

	void userRegist(User u);

	User userlogin(User u);

}
