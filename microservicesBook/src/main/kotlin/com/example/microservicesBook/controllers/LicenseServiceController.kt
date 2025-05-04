package com.example.microservicesBook.controllers

import com.example.microservicesBook.model.License
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/organizations/{organizationId}/licenses")
class LicenseServiceController {

    @GetMapping("/{licenseId}")
    fun getLicense(
        @PathVariable("organizationId") organizationId: String,
        @PathVariable("licenseId") licenseId: String,
    ): License {
        return License(
            id = licenseId,
            organizationId = organizationId,
            productName = "Teleco",
            licenseType = "Seat"
        )
    }
}