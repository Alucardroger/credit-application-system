package me.dio.creditapplicationsystem.entity

import me.dio.creditapplicationsystem.enummeration.Status
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

data class Credit (
    val creditCode: UUID = UUID.randomUUID(),
    val creditValue: BigDecimal = BigDecimal.ZERO,
    val dayFirstInstallment: LocalDate,
    val numberOfInstallments: Int = 0,
    val status: Status = Status.In_PROGRESS,
    val customer: Customer? = null,
    val id: Long? = null,

    )


