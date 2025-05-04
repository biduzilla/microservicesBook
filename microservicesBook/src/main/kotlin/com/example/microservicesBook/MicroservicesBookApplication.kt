package com.example.microservicesBook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroservicesBookApplication

fun main(args: Array<String>) {
	runApplication<MicroservicesBookApplication>(*args)
}
