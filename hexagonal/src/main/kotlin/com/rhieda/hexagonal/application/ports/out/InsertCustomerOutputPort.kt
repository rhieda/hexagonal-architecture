package com.rhieda.hexagonal.application.ports.out

import com.rhieda.hexagonal.application.core.domain.Customer

interface InsertCustomerOutputPort {
    fun insert(customer: Customer)
}