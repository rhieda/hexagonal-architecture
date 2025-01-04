package com.rhieda.hexagonal.application.adapters.out.client.response

import com.rhieda.hexagonal.application.core.domain.Address

// Separate from core domain, to decouple from layers.
data class AddressResponse(
    val street: String,
    val city: String,
    val state: String
) {
    fun toAddress() : Address {
        return Address(this.street, this.city, this.state)
    }
}
