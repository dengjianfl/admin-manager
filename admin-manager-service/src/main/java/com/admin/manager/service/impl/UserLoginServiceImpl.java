package com.admin.manager.service.impl;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.admin.common.pojo.ResultData;
import com.admin.common.util.JsonUtils;
import com.admin.manager.jedis.JedisClient;
import com.admin.manager.mapper.UserMapper;
import com.admin.manager.pojo.User;
import com.admin.manager.pojo.UserExample;
import com.admin.manager.pojo.UserExample.Criteria;
import com.admin.manager.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private JedisClient client;
	
	@Value("${USER_INFO}")
	private String USER_INFO;
	@Value("${EXPIRE_TIME}")
	private Integer EXPIRE_TIME;
	
	@Override
	public ResultData login(String username, String password) {
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		// 先校验用户名
		criteria.andUsernameEqualTo(username);
		List<User> list = userMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return ResultData.build(false, "账户名或密码错误");
		}
		// 再校验密码
		User user = list.get(0);
		String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
		if (!md5DigestAsHex.equalsIgnoreCase(user.getPassword())) {
			return ResultData.build(false, "账户名或密码错误");
		}
		
		String token = UUID.randomUUID().toString();
		
		user.setPassword(null);
		
		// 设置token信息
		client.set(USER_INFO+":"+token, JsonUtils.objectToJson(user));
		
		// 设置过期时间来模拟session
		client.expire(USER_INFO+":"+token, EXPIRE_TIME);
		
		return ResultData.build(true, "登录成功", token);
	}
	
	// 判断是否有token，返回boolean值
	public Boolean isTokenExist (String token) {
		return client.exists(USER_INFO+":"+token);
		
	}
	
	// 根据token获取当前登录人信息
	@Override
	public ResultData getUserByToken(String token) {
		//1.注入jedisclient
		//2.调用根据token查询 用户信息（JSON）的方法   get方法
		String strjson = client.get(USER_INFO+":"+token);
		//5.如果查询到  需要返回200  包含用户的信息  用户信息转成对象
		if(StringUtils.isNotBlank(strjson)){
			User user = JsonUtils.jsonToPojo(strjson, User.class);
			//重新设置过期时间
			//client.expire(USER_INFO+":"+token, EXPIRE_TIME);
			return ResultData.build(true, null, user);
		} else {
			return ResultData.build(false,"获取信息失败。");
		}
		
		
	}
	
	// 退出登录
	@Override
	public ResultData logOut(String token) {
		
		String strjson = client.get(USER_INFO+":"+token);
		if(StringUtils.isNotBlank(strjson)){
			// client.expire(strjson, 0);
			client.del(USER_INFO+":"+token);
			return ResultData.build(true, "退出成功!");
		} else{
			return ResultData.build(false, "退出失败!");
		}
	}
	
	
	
}
