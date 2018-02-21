package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ThymeLeafDAO;
import com.example.model.User;

@Service
public class ThymeLeafService {
	
	@Autowired
	private ThymeLeafDAO thymeLeafDAO;
	
	public void addFriend(User user) {
		//write a method to add a friend to database
		thymeLeafDAO.addFriend(user);
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return thymeLeafDAO.getUsers();
	}

	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return thymeLeafDAO.getUser(id);
		
	}

	public void editUser(User user, Integer id) {
		// TODO Auto-generated method stub
		thymeLeafDAO.editUser(user, id);
	}
	

}
