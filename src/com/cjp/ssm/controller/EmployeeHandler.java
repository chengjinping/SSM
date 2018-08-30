package com.cjp.ssm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjp.ssm.entities.Employee;
import com.cjp.ssm.service.EmployeeService;

@Controller
public class EmployeeHandler {
	@Autowired
	private EmployeeService employeeService;
	@RequestMapping("/emps")
	public String getAllEmps(Map<String,Object> maps){
		List<Employee> allEmps = employeeService.getAllEmps();
		maps.put("allEmps", allEmps);
		System.out.println("nihao");
		return "list";
		
	}
}
