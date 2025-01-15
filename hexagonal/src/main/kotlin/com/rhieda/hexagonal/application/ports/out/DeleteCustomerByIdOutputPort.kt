package com.rhieda.hexagonal.application.ports.out

interface DeleteCustomerByIdOutputPort {
    fun delete(id: String)
}