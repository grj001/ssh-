package com.zhiyou100.struts.service;

import com.zhiyou100.struts.model.User;

public interface UserService {

	void userRegist(User u);

	User userLogin(User u);

}
