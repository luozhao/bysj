package com.bcsf.fzw.login.service;

import java.util.List;

import com.bcsf.fzw.login.dao.TUserDAO;
import com.bcsf.fzw.login.model.TUser;
import com.bcsf.fzw.login.service.itfc.IUserService;

public class UserServiceImpl implements IUserService{

	private TUserDAO userDao;
	
	/**
	 * ÑéÖ¤µÇÂ¼
	 */
	@SuppressWarnings("unchecked")
	public TUser doLogin(TUser user) {
		List<TUser> list = userDao.findByExample(user);
		if(list.size() > 0){
			user = list.get(0);
		}
		return user;
	}

	public TUserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(TUserDAO userDao) {
		this.userDao = userDao;
	}

}
