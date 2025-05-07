package com.example.eurekasvr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekasvrApplication

fun main(args: Array<String>) {
	runApplication<EurekasvrApplication>(*args)
}
