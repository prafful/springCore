package com.springboot.maven.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.maven.entity.UserEntity;

@Repository
public interface UserRepository  extends CrudRepository<UserEntity, Integer>{
	
	//provide us with all the methods for CRUD operations
	
}
