package com.rhieda.hexagonal.application.ports.out

import com.rhieda.hexagonal.application.core.domain.Address

interface FindAddressByZipCodeOutputPort {
    fun find(zipCode: String): Address
}