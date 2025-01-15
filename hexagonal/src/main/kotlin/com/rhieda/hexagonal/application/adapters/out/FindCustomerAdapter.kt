package com.rhieda.hexagonal.application.adapters.out

import com.rhieda.hexagonal.application.adapters.out.repository.CustomerRepository
import com.rhieda.hexagonal.application.core.domain.Customer
import com.rhieda.hexagonal.application.ports.out.FindCustomerByIdOutputPort
import org.springframework.stereotype.Component
import kotlin.jvm.optionals.getOrNull

@Component
class FindCustomerAdapter(
    private val repository: CustomerRepository
): FindCustomerByIdOutputPort {
    override fun find(id: String): Customer? {
        return repository
            .findById(id)
            .getOrNull()
            .let {
                return it?.toCustomer()
            }

    }
}