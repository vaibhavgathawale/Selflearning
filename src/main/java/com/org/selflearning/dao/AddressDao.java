package com.org.selflearning.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.selflearning.entity.Address;

@Repository
public interface AddressDao extends CrudRepository<Address, Integer> {

}
