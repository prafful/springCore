package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.ThymeLeafService;

@RestController
public class ThymeleafRestController {
	
	@Autowired
	ThymeLeafService thymeLeafService;
	
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	public List<User> getUsers() {
		//get the list of all users form the database
		//use service and dao as a intermediary packages
		return thymeLeafService.getUsers();
		
	}
	
	@RequestMapping("/getuser/{id}")
	public User getUser(@PathVariable Integer id) {
		return thymeLeafService.getUser(id);
		
	}
	
	@RequestMapping(value="/adduser", method=RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		System.out.println(user.getUsername());
		thymeLeafService.addFriend(user);
	}
	
	@RequestMapping(value="/edituser/{id}", method=RequestMethod.POST)
	public void editUser(@RequestBody User user, @PathVariable Integer id) {
		//System.out.println(user.getUsername());
		thymeLeafService.editUser(user, id);
	}
		
	
	

}
