package com.neptum.spring.springorm.quiz.test;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neptum.spring.springorm.quiz.entity.Passenger;
import com.neptum.spring.springorm.quiz.passenger.dao.PassengerDao;

public class Test {

	public static void main(String[] args) {
		String url = "com/neptum/spring/springorm/quiz/test/config.xml";
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(url)) {
			PassengerDao passengerDao =  (PassengerDao) ctx.getBean("passengerDao");
			
			Passenger passenger = new Passenger();
			passenger.setId(123);
			passenger.setFirstName("Matheus");
			passenger.setLastName("Silva");
			passengerDao.create(passenger);
			
			System.out.println(passengerDao.find(123));
			
			Passenger updatePassenger = new Passenger();
			updatePassenger.setId(123);
			updatePassenger.setFirstName("Astrogilda");
			updatePassenger.setLastName("Xinforinvola");
			passengerDao.update(updatePassenger);
			
			passengerDao.delete(updatePassenger);
			
			System.out.println(passengerDao.findAll());
			
			System.out.println(passengerDao.findAll());
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}