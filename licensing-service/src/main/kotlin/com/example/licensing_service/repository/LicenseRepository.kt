package com.example.licensing_service.repository

import com.example.licensing_service.model.License
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LicenseRepository : JpaRepository<License, String> {

    fun findByOrganizationId(organizationId: String): List<License>
    fun findByOrganizationIdAndLicenseId(
        organizationId: String,
        licenseId: String
    ): License
}