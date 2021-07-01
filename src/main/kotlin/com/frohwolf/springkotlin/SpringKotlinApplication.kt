package com.frohwolf.springkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SpringKotlinApplication {

	@GetMapping
	fun welcome(): String {
		return "Welcome to Kotlin"
	}
}

fun main(args: Array<String>) {
	runApplication<SpringKotlinApplication>(*args)
}
