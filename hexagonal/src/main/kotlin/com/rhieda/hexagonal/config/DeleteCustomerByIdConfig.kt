package com.rhieda.hexagonal.config

import com.rhieda.hexagonal.application.adapters.out.DeleteCustomerByIdAdapter
import com.rhieda.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase
import com.rhieda.hexagonal.application.ports.`in`.DeleteCustomerByIdInputPort
import com.rhieda.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.rhieda.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DeleteCustomerByIdConfig {
    @Bean
    fun deleteCustomerById(
        findCustomerByIdInputPort: FindCustomerByIdInputPort,
        outputPort: DeleteCustomerByIdAdapter
    ): DeleteCustomerByIdInputPort = DeleteCustomerByIdUseCase(
        findCustomerByIdInputPort,
        outputPort
    )
}