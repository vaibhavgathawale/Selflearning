package com.org.selflearning.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.selflearning.entity.Department;

@Repository
public interface DeparmentDao extends CrudRepository<Department, String> {

}
