package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThymeLeafService {
	
	@Autowired
	private ThymeLeafDAO thymeLeafDAO;
	
	public void addFriend(User user) {
		//write a method to add a friend to database
		thymeLeafDAO.addFriend(user);
	}
	

}
