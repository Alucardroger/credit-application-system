package me.dio.creditapplicationsystem.entity

import jakarta.persistence.Embeddable
import jakarta.persistence.Embedded

@Embeddable
data class Address (
    var zipCode: String = "",
    var street: String = ""
)


