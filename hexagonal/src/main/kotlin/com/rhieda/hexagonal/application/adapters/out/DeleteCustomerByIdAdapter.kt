package com.rhieda.hexagonal.application.adapters.out

import com.rhieda.hexagonal.application.adapters.out.repository.CustomerRepository
import com.rhieda.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort
import org.springframework.stereotype.Component

@Component
class DeleteCustomerByIdAdapter(
    private val repository: CustomerRepository
): DeleteCustomerByIdOutputPort {
    override fun delete(id: String) {
        repository.deleteById(id)
    }
}