package com.neptum.spring.springjdbc.quiz.passenger.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.neptum.spring.springjdbc.quiz.passenger.dao.PassengerDao;
import com.neptum.spring.springjdbc.quiz.passenger.dto.Passenger;

class Test
{
	public static void main(String[] args) 
	{
		String path = "com/neptum/spring/springjdbc/quiz/passenger/test/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		PassengerDao passengerDao = (PassengerDao) ctx.getBean("passengerDaoImpl");
		
		Passenger passenger1 = new Passenger();
		passenger1.setId(456);
		passenger1.setFirstName("Godofredo");
		passenger1.setLastName("Fornales");
		System.out.println(passengerDao.create(passenger1));
		
		Passenger passenger2 = new Passenger();
		passenger2.setId(123);
		passenger2.setFirstName("bla");
		passenger2.setLastName("bla");		
		System.out.println("Number updated records" + passengerDao.update(passenger2));
		
		System.out.println("Retrieve one record " + passengerDao.read(456));
		
		List<Passenger> passengers = passengerDao.readAll();
		System.out.println("Retrieve all records " );
		passengers.forEach( pass -> System.out.println(pass));
		
		System.out.println("Delete one record " + passengerDao.delete(789));
	}
}