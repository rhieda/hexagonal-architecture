package com.rhieda.hexagonal.application.adapters.out

import com.rhieda.hexagonal.application.adapters.out.repository.CustomerRepository
import com.rhieda.hexagonal.application.adapters.out.repository.entity.CustomerEntity
import com.rhieda.hexagonal.application.core.domain.Customer
import com.rhieda.hexagonal.application.ports.out.InsertCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class InsertCustomerAdapter(
    private val repository: CustomerRepository
): InsertCustomerOutputPort {
    override fun insert(customer: Customer) {
        repository.save(CustomerEntity(customer))
    }
}