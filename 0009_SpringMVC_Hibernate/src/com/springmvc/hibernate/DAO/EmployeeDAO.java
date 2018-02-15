package com.springmvc.hibernate.DAO;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.springmvc.hibernate.entity.EmployeeEntity;

@Repository("employeeDAO")
public class EmployeeDAO {

	@Autowired
	 private SessionFactory sessionFactory;
	
	private static Logger logger = Logger.getLogger(EmployeeDAO.class);
	
	public void addEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(employeeEntity);
	}

}
