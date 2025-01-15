package com.rhieda.hexagonal.application.adapters.out

import com.rhieda.hexagonal.application.adapters.out.repository.CustomerRepository
import com.rhieda.hexagonal.application.adapters.out.repository.entity.CustomerEntity
import com.rhieda.hexagonal.application.core.domain.Customer
import com.rhieda.hexagonal.application.ports.out.UpdateCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class UpdateCustomerAdapter(
    private val repository: CustomerRepository
): UpdateCustomerOutputPort {
    override fun update(customer: Customer) {
        repository.save(CustomerEntity(customer))
    }
}