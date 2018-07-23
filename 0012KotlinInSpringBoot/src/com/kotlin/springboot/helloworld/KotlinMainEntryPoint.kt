package com.kotlin.springboot.helloworld

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootKotlinApplication{
	
	fun main(args:Array<String>){
		SpringApplication.run(SpringBootKotlinApplication, *args)
	}

}
