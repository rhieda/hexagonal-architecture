package com.rhieda.hexagonal.application.adapters.out.repository.entity

import com.rhieda.hexagonal.application.core.domain.Customer
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId
@Document(collection = "Customers")
data class CustomerEntity(
    @MongoId val id: String?,
    val name: String,
    var address: AddressEntity,
    val cpf: String,
    val isValidCpf: Boolean = false
) {
    constructor(customer: Customer): this(
        customer.id,
        customer.name,
        AddressEntity(customer.address!!),
        customer.cpf,
        customer.isValidCpf
    )
}