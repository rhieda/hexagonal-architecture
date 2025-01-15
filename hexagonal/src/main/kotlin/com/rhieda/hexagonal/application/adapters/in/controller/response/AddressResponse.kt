package com.rhieda.hexagonal.application.adapters.`in`.controller.response

import com.rhieda.hexagonal.application.core.domain.Address

data class AddressResponse(
    val street: String,
    val city: String,
    val state: String
) {
    constructor(address: Address): this(
        address.street,
        address.city,
        address.state
    )
}
