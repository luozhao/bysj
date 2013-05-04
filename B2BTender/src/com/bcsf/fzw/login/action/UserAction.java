package com.bcsf.fzw.login.action;

import com.bcsf.fzw.login.model.TUser;
import com.bcsf.fzw.login.service.itfc.IUserService;
import com.opensymphony.xwork2.ActionSupport;


public class UserAction extends ActionSupport{

	private IUserService userService;
	
	private TUser user;
	
	@Override
	public String execute() throws Exception {
		System.out.println("µÇÂ¼");
		return SUCCESS;
	}
	
	/**
	 * µÇÂ¼
	 * @return
	 */
	public String doLogin(){
		
	    user = new TUser();
	    user.setUname("admin");
	    user.setUpwd("admin");
		System.out.println("µÇÂ¼"+userService.doLogin(user));
		return "okLogin";
		
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public TUser getUser() {
		return user;
	}

	public void setUser(TUser user) {
		this.user = user;
	}
	
}
