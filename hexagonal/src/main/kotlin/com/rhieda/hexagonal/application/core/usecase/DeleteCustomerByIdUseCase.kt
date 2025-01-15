package com.rhieda.hexagonal.application.core.usecase

import com.rhieda.hexagonal.application.ports.`in`.DeleteCustomerByIdInputPort
import com.rhieda.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.rhieda.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort

class DeleteCustomerByIdUseCase(
    private val findCustomerByIdInputPort: FindCustomerByIdInputPort,
    private val outputPort: DeleteCustomerByIdOutputPort
): DeleteCustomerByIdInputPort {
    override fun delete(id: String) {
        findCustomerByIdInputPort.find(id)
        outputPort.delete(id)
    }
}