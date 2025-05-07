package com.example.licensing_service.service

import com.example.licensing_service.client.OrganizationFeignClient
import com.example.licensing_service.model.License
import com.example.licensing_service.model.Organization
import com.example.licensing_service.repository.LicenseRepository
import org.springframework.stereotype.Service

@Service
class LicenseService(
    private val licenseRepository: LicenseRepository,
    private val organizationFeignClient: OrganizationFeignClient
) {

    private fun retrieveOrgInfo(organizationId: String, clientType: String): Organization {
        return organizationFeignClient.getOrganization(organizationId)
    }

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