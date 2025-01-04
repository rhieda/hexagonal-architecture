package com.rhieda.hexagonal.application.ports.`in`

import com.rhieda.hexagonal.application.core.domain.Customer

interface InsertCustomerInputPort {
    fun insert(customer: Customer, zipCode: String)
}