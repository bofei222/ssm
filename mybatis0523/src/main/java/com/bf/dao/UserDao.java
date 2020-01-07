package com.bf.dao;

import java.util.List;

import com.bf.pojo.User;

public interface UserDao {
	User findUserById(Integer id);
	
	List<User> findUserByUserName(String username);

	int insertUser(User user);
}
