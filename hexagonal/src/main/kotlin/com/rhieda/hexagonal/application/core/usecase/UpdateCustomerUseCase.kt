package com.rhieda.hexagonal.application.core.usecase

import com.rhieda.hexagonal.application.adapters.out.FindAddressByZipCodeAdapter
import com.rhieda.hexagonal.application.core.domain.Customer
import com.rhieda.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.rhieda.hexagonal.application.ports.`in`.UpdateCustomerInputPort
import com.rhieda.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import com.rhieda.hexagonal.application.ports.out.UpdateCustomerOutputPort

class UpdateCustomerUseCase(
    private val findCustomerByIdUseCase: FindCustomerByIdInputPort,
    private val findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    private val updateCustomerOutputPort: UpdateCustomerOutputPort
): UpdateCustomerInputPort {
    override fun update(customer: Customer, zipCode: String) {
        if (customer.id == null) {
            throw IllegalArgumentException("The id field cannot be null")
        }
        val customer = findCustomerByIdUseCase.find(customer.id)
        customer.apply {
            address = findAddressByZipCodeOutputPort.find(zipCode)
        }.let {
            updateCustomerOutputPort.update(it)
        }
    }
}