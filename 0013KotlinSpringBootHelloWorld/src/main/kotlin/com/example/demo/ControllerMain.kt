package com.example.demo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employee")
class ControllerMain {
	
	@RequestMapping("/help")
	fun welcome():String{
		return "Hello Kotlin from Spring"
	}


}