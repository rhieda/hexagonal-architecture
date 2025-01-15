package com.rhieda.hexagonal.application.ports.`in`

import com.rhieda.hexagonal.application.core.domain.Customer

interface UpdateCustomerInputPort {
    fun update(customer: Customer, zipCode: String)
}