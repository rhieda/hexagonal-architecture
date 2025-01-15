package com.rhieda.hexagonal.application.core.usecase

import com.rhieda.hexagonal.application.core.domain.Customer
import com.rhieda.hexagonal.application.core.exceptions.ObjectNotFoundException
import com.rhieda.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.rhieda.hexagonal.application.ports.out.FindCustomerByIdOutputPort

class FindCustomerByIdUseCase(
    private val findCustomerByIdOutputPort: FindCustomerByIdOutputPort
): FindCustomerByIdInputPort {
    override fun find(id: String): Customer {
        return findCustomerByIdOutputPort.find(id) ?: throw ObjectNotFoundException("Customer not found")
    }
}