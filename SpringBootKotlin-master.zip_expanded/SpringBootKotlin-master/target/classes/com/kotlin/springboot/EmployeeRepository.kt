package com.kotlin.springboot

import org.springframework.data.repository.CrudRepository
		
interface EmployeeRepository : CrudRepository<Employee, Long>
{
	
}