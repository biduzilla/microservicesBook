package com.example.microservicesBook.model

data class License(
    var id: String,
    var organizationId: String,
    var productName: String,
    var licenseType: String,
)
