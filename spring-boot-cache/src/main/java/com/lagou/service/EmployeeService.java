package com.lagou.service;

import com.lagou.mapper.EmployeeMapper;
import com.lagou.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author lane
 * @date 2021年04月25日 上午10:27
 */
@Service
@CacheConfig(cacheNames = {"employee"})
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;


	@Cacheable(cacheNames = {"employee"},key = "#id",condition = "#id>0",unless = "#result ==null")
	public Employee getEmpById(Integer id){

		Employee emp = employeeMapper.getEmpById(id);

		return emp;
	}

	@CachePut(cacheNames = {"employees"},key = "#employee.id")
	public Employee updateEmp(Employee employee){
		employeeMapper.updateEmp(employee);
		return employee;
	}

	@CacheEvict(cacheNames = "employee",key = "#id",beforeInvocation = true)
	public void delEmp(Integer id){
		employeeMapper.deleteEmpById(id);
	}
}
