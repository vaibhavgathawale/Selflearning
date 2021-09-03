package com.org.selflearning.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.selflearning.entity.Company;
@Repository
public interface CompanyDao extends CrudRepository<Company, String>{

}
