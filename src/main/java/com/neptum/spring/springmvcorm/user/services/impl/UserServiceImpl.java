package com.neptum.spring.springmvcorm.user.services.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neptum.spring.springmvcorm.user.dao.UserDao;
import com.neptum.spring.springmvcorm.user.entity.User;
import com.neptum.spring.springmvcorm.user.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Transactional
	public int save(User user) {		
		return dao.createUser(user);
	}

	@Override
	public List<User> getUsers() {
		List<User> users = dao.findUsers();
		Collections.sort(users);
		return users;
	}

	@Override
	public User getUser(Integer id) {		
		return dao.findUser(id);
	}

}