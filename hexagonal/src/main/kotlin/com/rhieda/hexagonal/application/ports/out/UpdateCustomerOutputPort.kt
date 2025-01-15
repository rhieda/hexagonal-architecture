package com.rhieda.hexagonal.application.ports.out

import com.rhieda.hexagonal.application.core.domain.Customer

interface UpdateCustomerOutputPort {
    fun update(customer: Customer)
}