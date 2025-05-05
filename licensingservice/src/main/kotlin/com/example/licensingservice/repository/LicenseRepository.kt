package com.example.licensingservice.repository

import com.example.licensingservice.model.License
import org.springframework.data.jpa.repository.JpaRepository


interface LicenseRepository : JpaRepository<License, String> {

    fun findByOrganizationId(organizationId: String): List<License>
    fun findByOrganizationIdAndLicenseId(
        organizationId: String,
        licenseId: String
    ): License
}