package com.rhieda.hexagonal.application.adapters.out.repository

import com.rhieda.hexagonal.application.adapters.out.repository.entity.CustomerEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: MongoRepository<CustomerEntity, String> {

}