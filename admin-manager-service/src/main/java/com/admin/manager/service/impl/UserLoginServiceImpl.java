package com.admin.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.admin.common.pojo.ResultData;
import com.admin.manager.mapper.UserMapper;
import com.admin.manager.pojo.User;
import com.admin.manager.pojo.UserExample;
import com.admin.manager.pojo.UserExample.Criteria;
import com.admin.manager.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public ResultData login(String username, String password) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		// 先校验用户名
		criteria.andUsernameEqualTo(username);
		List<User> list = userMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return ResultData.build(400, "账户名或密码错误");
		}
		// 再校验密码
		User user = list.get(0);
		String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
		if (!md5DigestAsHex.equalsIgnoreCase(user.getPassword())) {
			return ResultData.build(400, "账户名或密码错误");
		}
		return ResultData.build(200, "登录成功");
	}

}
