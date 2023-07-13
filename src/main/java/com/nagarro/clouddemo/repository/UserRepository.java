package com.nagarro.clouddemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.clouddemo.model.User;

@Repository
public interface  UserRepository extends CrudRepository<User,Integer> {

}
