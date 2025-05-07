package com.example.licensing_service.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "licenses")
data class License(
    @Id
    @Column(name = "license_id", nullable = false)
    val licenseId: String = UUID.randomUUID().toString(),

    @ManyToOne
    @JoinColumn(name = "organization_id", nullable = false)
    val organizationId: String,

    @Column(name = "product_name", nullable = false)
    val productName: String,

    @Column(name = "license_type", nullable = false)
    val licenseType: String,

    @Column(name = "license_max", nullable = false)
    val licenseMax: Int,

    @Column(name = "license_allocated", nullable = false)
    val licenseAllocated: Int,

    @Column(name = "comment", nullable = false)
    val comment: String,
)
