package com.neptum.spring.springjdbc.quiz.passenger.dao;

import java.util.List;

import com.neptum.spring.springjdbc.quiz.passenger.dto.Passenger;

public interface PassengerDao 
{
	int create(Passenger passenger);
	
	Passenger read(int id);
	
	List<Passenger> readAll();
	
	int update(Passenger passenger);
	
	int delete(int id);
}