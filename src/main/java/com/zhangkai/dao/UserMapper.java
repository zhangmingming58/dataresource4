package com.zhangkai.dao;

import org.apache.ibatis.annotations.Mapper;

import com.zhangkai.domain.User;

/**
 * 
 * @ClassName: UserMapper
 * @Description: TODO
 * @author: ZK
 * @date: 2019年9月9日 上午8:57:40
 */
@Mapper
public interface UserMapper {

	/**
	 * @Title: insertUser
	 * @Description: 新增
	 * @param user
	 * @return
	 * @return: int
	 */
	int insertUser(User user);
}
