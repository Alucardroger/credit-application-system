package me.dio.creditapplicationsystem.entity

import jakarta.persistence.*

@Entity
//@Table(name = "Client")
data class Customer(
    @Column(nullable = false) var firstname: String = "",
    @Column(nullable = false) var lastname: String = "",
    @Column(nullable = false, unique = true) var email: String = "",
    @Column(nullable = false, unique = true) val cpf:String,
    @Column(nullable = false) var password: String = "",
    @Column(nullable = false) var address: Address = Address(),
    @Column(nullable = false) @OneToMany(fetch = FetchType.LAZY,
        cascade = arrayOf(CascadeType.REMOVE, CascadeType.PERSIST),
        mappedBy = "customer")
    var credits: List<Credit> = mutableListOf(),
    @Column(nullable = false) @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null
)
