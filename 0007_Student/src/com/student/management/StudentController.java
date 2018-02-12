package com.student.management;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/hello")
	public String student(Model m){
		m.addAttribute("name", "Prafful Daga");
		m.addAttribute("age", "11");
		m.addAttribute("id", "008");
		return "test";
	}
	
	@RequestMapping("/open")
	public ModelAndView openStudent(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("command", new Student());
		mv.setViewName("student");
		return mv;
		
	}
	
	@RequestMapping("/show")
	public String showStudent(@ModelAttribute("sample") Student s, Model model){
		
		model.addAttribute("name", s.getName());
		model.addAttribute("id", s.getId());
		model.addAttribute("age", s.getAge1());

		return "result";
		
		

	}
	
	
}
