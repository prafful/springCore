package com.kotlin.springboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
open class KotlinRestApplication

fun main(args: Array<String>) {
    runApplication<KotlinRestApplication>(*args)
	println("Hello to Kotlin from Spring Boot")
}
