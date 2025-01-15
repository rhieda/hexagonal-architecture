package com.rhieda.hexagonal.config

import com.rhieda.hexagonal.application.core.usecase.UpdateCustomerUseCase
import com.rhieda.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.rhieda.hexagonal.application.ports.`in`.UpdateCustomerInputPort
import com.rhieda.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import com.rhieda.hexagonal.application.ports.out.UpdateCustomerOutputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UpdateCustomerConfig {
    @Bean
    fun updateCustomer(
        findCustomerByIdInputPort: FindCustomerByIdInputPort,
        findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
        updateCustomerOutputPort: UpdateCustomerOutputPort
    ): UpdateCustomerInputPort {
        return UpdateCustomerUseCase(
            findCustomerByIdInputPort,
            findAddressByZipCodeOutputPort,
            updateCustomerOutputPort
        )
    }
}