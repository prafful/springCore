package com.springboot.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.maven.entity.UserEntity;
import com.springboot.maven.model.User;
import com.springboot.maven.repository.UserRepository;

@Controller
public class HelloFriend {
	
	@Autowired(required=true)
	private UserRepository userRepository;
	
	@Autowired
	private UserEntity userEntity;
	
	@RequestMapping("/hello")
	public String hello() {
		return "WOWOWOWO - Spring Boot 4.0!!! Again";
	}
	
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping(value="/adduser", method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute User user ) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adduser");
		mv.addObject("userReceived", user);
		System.out.println(user.fname + " " + user.lname);
		userEntity = new UserEntity();
		userEntity.setFname(user.fname);
		userEntity.setLname(user.lname);
		userRepository.save(userEntity);
		return mv;
	}
	

}
