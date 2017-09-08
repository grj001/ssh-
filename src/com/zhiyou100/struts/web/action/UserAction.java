package com.zhiyou100.struts.web.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhiyou100.struts.model.User;
import com.zhiyou100.struts.service.UserService;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport{

	@Autowired
	private UserService us;
	
	private User u;
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}

	//页面跳转
	//注册
	public String user_registIndex(){
		return SUCCESS;
	}
	//登录
	public String user_loginIndex(){
		return SUCCESS;
	}
	

	
	
	//获取表单
	//注册
	public String user_regist(){
		
		//System.out.println("***\n" + u +"\n***");
		/*
		 * 获取表单数据
		 * 调用service方法
		 */
		ActionContext ac = ActionContext.getContext();
		ac.put("message", "注册成功");
		
		us.userRegist(u);
		
		return SUCCESS;
	}
	//登录
	public String user_login(){
		
		//System.out.println("***\n" + u +"\n***");
		ActionContext ac = ActionContext.getContext();
		
		User user = us.userLogin(u);
		
		//System.out.println("***\n" + user +"\n***");
		
		if(user != null){
			ac.put("message", "登录成功");
		} else {
			ac.put("message", "登录失败");
		}
		
		return SUCCESS;
	}
	
}
