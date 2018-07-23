package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication



@SpringBootApplication
open class MainEntryClass

fun main(args: Array<String>) {
    runApplication<MainEntryClass>(*args)
	println("Hello to Kotlin from Spring Boot")
}
