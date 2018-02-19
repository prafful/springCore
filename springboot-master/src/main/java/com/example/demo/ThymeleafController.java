package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {

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
		System.out.println(user.getUsername());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register");
		mv.addObject("ru", user);
		return mv;
	}
}
