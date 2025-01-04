package com.rhieda.hexagonal.application.adapters.`in`.controller

import com.rhieda.hexagonal.application.adapters.`in`.controller.request.CustomerRequest
import com.rhieda.hexagonal.application.core.domain.Customer
import com.rhieda.hexagonal.application.ports.`in`.InsertCustomerInputPort
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/customers")
class CustomerController(
    private val insertCustomerInputPort: InsertCustomerInputPort
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun insert(@Valid @RequestBody customerRequest: CustomerRequest) {
//        val customer = Customer(
//            name = customerRequest.name,
//            cpf = customerRequest.cpf
//        )
//        insertCustomerInputPort.insert(customer, customerRequest.zipCode)
        // or
        with(customerRequest) {
            insertCustomerInputPort.insert(
                Customer(
                    name = name,
                    cpf = cpf
                ),
                zipCode
            )
        }
    }
}