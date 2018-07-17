package com.springboot.maven.beginner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloFriend {
	
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
		return mv;
	}
	

}
