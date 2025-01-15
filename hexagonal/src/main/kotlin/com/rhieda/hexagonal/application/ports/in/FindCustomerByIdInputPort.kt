package com.rhieda.hexagonal.application.ports.`in`

import com.rhieda.hexagonal.application.core.domain.Customer

interface FindCustomerByIdInputPort {
    fun find(id: String): Customer
}