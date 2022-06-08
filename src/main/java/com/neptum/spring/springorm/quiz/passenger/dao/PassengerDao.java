package com.neptum.spring.springorm.quiz.passenger.dao;

import java.util.List;

import com.neptum.spring.springorm.quiz.entity.Passenger;

public interface PassengerDao {

	int create(Passenger passenger);
	
	void update(Passenger passenger);
	
	void delete(Passenger passenger);
	
	Passenger find(int id);
	
	List<Passenger> findAll();

}