package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.ProfileInformation;
import com.example.model.User;
import com.example.service.ThymeLeafService;

@Controller
public class ThymeleafController {
	
	@Autowired
	private ThymeLeafService thymeLeafService;

	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello...";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute User user) {
		System.out.println("Username: " + user.getUsername());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Name: " + user.getProfileInformation().getName());
		System.out.println("Location: " + user.getProfileInformation().getLocation());
		System.out.println("Profile Information: " + user.getProfileInformation());
		
		ProfileInformation pi = new ProfileInformation();
		pi.setName(user.getProfileInformation().getName());
		pi.setLocation(user.getProfileInformation().getLocation());
		pi.setPid(user.getProfileInformation().getPid());
		user.setProfileInformation(pi);
		//use service to add user object to database
		thymeLeafService.addFriend(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register");
		mv.addObject("ru", user);
		return mv;
	}
	
	
	
	
}
