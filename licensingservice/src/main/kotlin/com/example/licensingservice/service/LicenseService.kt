package com.example.licensingservice.service

import com.example.licensingservice.model.License
import com.example.licensingservice.repository.LicenseRepository
import org.springframework.stereotype.Service

@Service
class LicenseService(private val licenseRepository: LicenseRepository) {
    fun getLicense(
        organizationId: String,
        licenseId: String
    ): License {
        return licenseRepository.findByOrganizationIdAndLicenseId(
            organizationId,
            licenseId
        )
    }

    fun getLicensesByOrg(organizationId: String): List<License> {
        return licenseRepository.findByOrganizationId(organizationId)
    }

    fun saveLicense(license: License) {
        licenseRepository.save(license);
    }

    fun updateLicense(license: License) {
        licenseRepository.save(license);
    }

    fun deleteLicense(license: License) {
        licenseRepository.delete(license)
    }
}