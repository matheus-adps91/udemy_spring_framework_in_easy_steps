package com.neptum.spring.springorm.quiz.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.neptum.spring.springorm.quiz.entity.Passenger;
import com.neptum.spring.springorm.quiz.passenger.dao.PassengerDao;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Passenger passenger) {
		return (int) hibernateTemplate.save(passenger);
	}

	@Override
	@Transactional
	public void update(Passenger passenger) {
		hibernateTemplate.update(passenger);
	}

	@Override
	@Transactional
	public void delete(Passenger passenger) {
		hibernateTemplate.delete(passenger);
	}

	@Override
	@Transactional
	public Passenger find(int id) {
		return hibernateTemplate.get(Passenger.class, id);
	}

	@Override
	@Transactional
	public List<Passenger> findAll() {
		return hibernateTemplate.loadAll(Passenger.class);
	}

}