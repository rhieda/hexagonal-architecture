package com.rhieda.hexagonal.config

import com.rhieda.hexagonal.application.adapters.out.FindAddressByZipCodeAdapter
import com.rhieda.hexagonal.application.adapters.out.InsertCustomerAdapter
import com.rhieda.hexagonal.application.core.usecase.InsertCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustomerConfig {
    @Bean
    fun insertCustomer(
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        insertCustomerAdapter: InsertCustomerAdapter
    ) = InsertCustomerUseCase(
            findAddressByZipCodeAdapter,
            insertCustomerAdapter
        )
}