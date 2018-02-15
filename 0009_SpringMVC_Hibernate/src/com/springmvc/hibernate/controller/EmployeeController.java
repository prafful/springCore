package com.springmvc.hibernate.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.springmvc.hibernate.bean.EmployeeBean;
import com.springmvc.hibernate.entity.EmployeeEntity;
import com.springmvc.hibernate.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	private static Logger logger = Logger.getLogger(EmployeeController.class);
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
	  return new ModelAndView("index");
	 }
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	 public ModelAndView addEmployee() {
	  //Map<String, Object> model = new HashMap<String, Object>();
	  //model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
	  //return new ModelAndView("addEmployee", model);
		ModelAndView mv = new ModelAndView();
		mv.addObject("command", new EmployeeBean());
		mv.setViewName("addEmployee");
		return mv;
	 }
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command")EmployeeBean employeeBean, BindingResult result) {
	  //EmployeeEntity employeeEntity = prepareModel(employeeBean);
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setAddress(employeeBean.getAddress());
		employeeEntity.setAge(employeeBean.getAge());
		employeeEntity.setName(employeeBean.getName());
		employeeEntity.setSalary(employeeBean.getSalary());
		employeeEntity.setId(employeeBean.getId());
		//employeeBean.setId(null);
	  employeeService.addEmployee(employeeEntity);
	  return new ModelAndView("redirect:/add.html");
	 }

}
