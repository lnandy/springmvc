package com.cn.eagle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.eagle.bo.UserBo;
import com.cn.eagle.service.UserService;
import com.cn.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserBo userBo;
	
	@Override
	public User selectByPrimaryKey(Integer id) {
		return userBo.selectByPrimaryKey(id);
	}

}
