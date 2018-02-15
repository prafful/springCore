package com.springmvc.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.hibernate.DAO.EmployeeDAO;
import com.springmvc.hibernate.entity.EmployeeEntity;


@Service("employeeService")
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	public void addEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		employeeDAO.addEmployee(employeeEntity);
		
	}

}
