package me.dio.creditapplicationsystem.entity

import jakarta.validation.constraints.Email
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address

data class customer(
    var firstname: String = "",
    var lastnam: String = "",
    val cpf:String,
    var email: String = "",
    var password: String = "",
    var address: Address = Address(),
    
)
