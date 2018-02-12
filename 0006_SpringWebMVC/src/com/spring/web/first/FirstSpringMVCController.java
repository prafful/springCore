package com.spring.web.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class FirstSpringMVCController {

	@RequestMapping("/hello")
	public String sayHello(ModelMap m){
		m.addAttribute("message", "Hello Spring Web MVC");
		return "hello";
	}
	
	@RequestMapping("/kitchen")
	public String sayKitchen(ModelMap m){
		m.addAttribute("message", "Hello Spring Kitchen");
		return "kitchen";
	}
	
}
