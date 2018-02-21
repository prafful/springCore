package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.ProfileInformation;

public interface ProfileInformationRepository extends CrudRepository<ProfileInformation, Integer> {

	// get all friends
	// get one friend
	// update one friend
	// delete one friend
	// add one friend

}
