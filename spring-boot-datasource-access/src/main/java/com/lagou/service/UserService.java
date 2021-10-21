package com.lagou.service;

import com.lagou.mapper.UserMapper;
import com.lagou.pojo.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lane
 * @date 2021年04月24日 上午10:23
 */
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	Logger logger = LoggerFactory.getLogger(UserService.class);

	public List<User> findAllUser() {

		List<User> allUser = userMapper.findAllUser();
		logger.info("用户信息为："+allUser.toString());
		return allUser;
	}
}
