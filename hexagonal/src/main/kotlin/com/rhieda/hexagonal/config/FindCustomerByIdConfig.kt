package com.rhieda.hexagonal.config

import com.rhieda.hexagonal.application.adapters.out.FindCustomerAdapter
import com.rhieda.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import com.rhieda.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FindCustomerByIdConfig {
    @Bean
    fun findCustomerById(
        findCustomerByIdAdapter: FindCustomerAdapter
    ): FindCustomerByIdInputPort = FindCustomerByIdUseCase(findCustomerByIdOutputPort = findCustomerByIdAdapter)
}