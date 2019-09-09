package com.zhangkai.service;

import com.zhangkai.domain.User;

/**
 * 
 * @ClassName: UserService
 * @Description: TODO
 * @author: ZK
 * @date: 2019年9月9日 上午9:01:36
 */
public interface UserService {
	/**
	 * @Title: addUser
	 * @Description: 新增
	 * @param user
	 * @return
	 * @return: int
	 */
	int addUser(User user);
}
