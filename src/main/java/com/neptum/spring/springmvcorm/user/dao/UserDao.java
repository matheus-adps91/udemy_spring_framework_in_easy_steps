package com.neptum.spring.springmvcorm.user.dao;

import java.util.List;

import com.neptum.spring.springmvcorm.user.entity.User;

public interface UserDao {

	int createUser(User user);
	
	List<User> findUsers();
	
	User findUser(Integer id);
}
