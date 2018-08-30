package com.cjp.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjp.ssm.dao.EmployeeMapper;
import com.cjp.ssm.entities.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	public List<Employee> getAllEmps(){
		return employeeMapper.getAllEmps();
	}
	
}
