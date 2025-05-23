package com.example.licensingservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.context.config.annotation.RefreshScope

@SpringBootApplication
@RefreshScope
class LicensingserviceApplication

fun main(args: Array<String>) {
	runApplication<LicensingserviceApplication>(*args)
}
