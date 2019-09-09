package com.zhangkai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhangkai.dao.UserMapper;
import com.zhangkai.domain.User;
import com.zhangkai.service.UserService;

/**
 * 
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author: ZK
 * @date: 2019年9月9日 上午9:02:37
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	/*
	 * (non Javadoc)
	 * 
	 * @Title: addUser
	 * 
	 * @Description: 新增
	 * 
	 * @param user
	 * 
	 * @return
	 * 
	 * @see
	 * com.zhangkai.senior4.week2.service.UserService#addUser(com.zhangkai.senior4.
	 * week2.domain.User)
	 */
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}

}
