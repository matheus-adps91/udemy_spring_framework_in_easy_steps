package com.neptum.spring.springjdbc.employee.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.neptum.spring.springjdbc.employee.dto.Employee;

public class EmployeeRowMapper 
	implements 
		RowMapper<Employee> 
{
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setFirstName(rs.getString(2));
		emp.setSecondName(rs.getString(3));
		return emp;
	}
}