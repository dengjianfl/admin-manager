package com.admin.manager.service;

import com.admin.common.pojo.ResultData;

public interface UserLoginService {
	public ResultData login(String username, String password);
}
