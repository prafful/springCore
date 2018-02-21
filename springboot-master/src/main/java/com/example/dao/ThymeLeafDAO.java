package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.mockito.exceptions.misusing.FriendlyReminderException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.User;
import com.example.repository.UserRepository;

@Repository
public class ThymeLeafDAO {

	@Autowired
	private UserRepository userRepository;
	
	public void addFriend(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		/*
		 * private List<User> = new ArrayList<>(
		 * new User("qwe","eqweq", "eqweqw"),
		 * new User("qwe","eqweq", "eqweqw"),
		 * new User("qwe","eqweq", "eqweqw")
		 * )
		 */
		List<User> user = new ArrayList<>();
		userRepository.findAll().forEach(user::add);
		return user;
	}

	public User getUser(Integer id) {
		
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}

	public void editUser(User user, Integer id) {
		// TODO Auto-generated method stub
		User u = userRepository.findOne(id);
		u.setEmail(user.getEmail());
		u.setUsername(user.getUsername());
		userRepository.save(u);
	}

}
