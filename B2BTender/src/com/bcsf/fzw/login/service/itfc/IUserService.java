package com.bcsf.fzw.login.service.itfc;

import com.bcsf.fzw.login.model.TUser;

public interface IUserService {

	/**
	 * ��֤��¼
	 * @param user
	 * @return
	 */
	public TUser doLogin(TUser user);
	
}
