package com.admin.manager.service;

import com.admin.common.pojo.ResultData;
import com.admin.manager.pojo.User;

public interface UserRegisterService {
	/**
	 * 检查数据的可用性，如果注册的账号已经存在，则不允许再注册
	 */
	
	public ResultData checkData(String username, String phone);
	
	/**
	 * 注册账号
	 */
	public ResultData register(User user);
}
