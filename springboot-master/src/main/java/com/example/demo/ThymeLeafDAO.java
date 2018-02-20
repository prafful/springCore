package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ThymeLeafDAO {

	@Autowired
	private FriendRepository friendRepository;
	
	public void addFriend(User user) {
		// TODO Auto-generated method stub
		friendRepository.save(user);
	}

}
