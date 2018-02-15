package com.springmvc.hibernate.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.hibernate.entity.EmployeeEntity;

@Repository("employeeDAO")
public class EmployeeDAO {

	@Autowired
	 private SessionFactory sessionFactory;
	
	public void addEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(employeeEntity);
	}

}
