package com.lagou.controller;

import com.lagou.pojo.Employee;
import com.lagou.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lane
 * @date 2021年04月25日 上午10:29
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/emp/{id}")
	public Employee getEmp(@PathVariable("id") Integer id){

		Employee emp = employeeService.getEmpById(id);

		return emp;
	}

	@RequestMapping("/updateEmp/{id}")
	public Employee updateEmp(@PathVariable("id") Integer id){
		Employee emp = employeeService.getEmpById(id);
		emp.setLastName("lanedu2");
		employeeService.updateEmp(emp);
		return emp;

	}

	@RequestMapping("/deleteEmp/{id}")
	public Integer deleteEmp(@PathVariable("id") Integer id){

		employeeService.delEmp(id);

		return id ;

	}
	@Value("${com.name}")
	private String name;
	@Value("${com.location}")
	private String location;

	@RequestMapping("/profile")
	public String proTest(){

		String s =name+ "来自"+location;
		return s;
	}




}
