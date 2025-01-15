package com.rhieda.hexagonal.application.ports.out

import com.rhieda.hexagonal.application.core.domain.Customer

interface FindCustomerByIdOutputPort {
    fun find(id: String): Customer?
}