package com.org.selflearning.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.selflearning.entity.Employee;
@Repository
public interface EmployeeDao extends CrudRepository<Employee, String>  {
	//String sql = " SELECT eId, eName FROM Employee ";
			
			
	
}
