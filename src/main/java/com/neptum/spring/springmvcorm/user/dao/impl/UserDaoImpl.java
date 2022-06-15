package com.neptum.spring.springmvcorm.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.neptum.spring.springmvcorm.user.dao.UserDao;
import com.neptum.spring.springmvcorm.user.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public int createUser(User user) {
		Integer result = (Integer) hibernateTemplate.save(user);
		return result;
	}

	@Override
	public List<User> findUsers() {
		List<User> users = hibernateTemplate.loadAll(User.class);
		return users;
	}

	@Override
	public User findUser(Integer id) {
		return hibernateTemplate.get(User.class, id);
	}

}
