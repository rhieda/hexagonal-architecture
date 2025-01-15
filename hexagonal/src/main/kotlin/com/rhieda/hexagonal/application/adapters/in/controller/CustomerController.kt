package com.rhieda.hexagonal.application.adapters.`in`.controller

import com.rhieda.hexagonal.application.adapters.`in`.controller.request.CustomerRequest
import com.rhieda.hexagonal.application.adapters.`in`.controller.response.CustomerResponse
import com.rhieda.hexagonal.application.adapters.out.repository.entity.CustomerEntity
import com.rhieda.hexagonal.application.core.domain.Customer
import com.rhieda.hexagonal.application.ports.`in`.DeleteCustomerByIdInputPort
import com.rhieda.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.rhieda.hexagonal.application.ports.`in`.InsertCustomerInputPort
import com.rhieda.hexagonal.application.ports.`in`.UpdateCustomerInputPort
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/customers")
class CustomerController(
    private val insertCustomerInputPort: InsertCustomerInputPort,
    private val findCustomerInputPort: FindCustomerByIdInputPort,
    private val updateCustomerInputPort: UpdateCustomerInputPort,
    private val deleteCustomerByIdInputPort: DeleteCustomerByIdInputPort
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun insert(@Valid @RequestBody customerRequest: CustomerRequest) {
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

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun find(@PathVariable id: String): CustomerResponse {
        val customer = findCustomerInputPort.find(id)
        return CustomerResponse(customer)
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(
        @PathVariable id: String,
        @Valid @RequestBody customerRequest: CustomerRequest
    ) {
        with(customerRequest) {
            val customer = Customer(id, name, cpf = cpf)
            val customerResponse = updateCustomerInputPort.update(customer, zipCode)
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCustomerById(@PathVariable id: String) {
        deleteCustomerByIdInputPort.delete(id)
    }
}