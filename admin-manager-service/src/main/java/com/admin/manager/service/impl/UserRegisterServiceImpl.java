package com.admin.manager.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.admin.common.pojo.ResultData;
import com.admin.manager.mapper.UserMapper;
import com.admin.manager.pojo.User;
import com.admin.manager.pojo.UserExample;
import com.admin.manager.pojo.UserExample.Criteria;
import com.admin.manager.service.UserRegisterService;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public ResultData checkData(String username, String phone) {
		
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		
		criteria.andPhoneEqualTo(phone);
		criteria.andUsernameEqualTo(username);
		
		List<User> list = userMapper.selectByExample(example);
		
		if (list != null && list.size() > 0) {
			return ResultData.ok(false);
		}
		return ResultData.ok(true);
	}

	@Override
	public ResultData register(User user) {
		
		ResultData result = checkData(user.getUsername(),user.getPhone());
		if (!(boolean)result.getData()) {
			return ResultData.build(400, "账号已经注册");
		}
		user.setCreated(new Date());
		user.setUpdated(user.getCreated());
		
		String md5password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
		user.setPassword(md5password);
		
		userMapper.insertSelective(user);
		return ResultData.build(200, "注册成功");
	}

}
