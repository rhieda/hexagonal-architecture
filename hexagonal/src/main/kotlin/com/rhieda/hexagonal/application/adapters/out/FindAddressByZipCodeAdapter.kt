package com.rhieda.hexagonal.application.adapters.out

import com.rhieda.hexagonal.application.adapters.out.client.FindAddressByZipCodeClient
import com.rhieda.hexagonal.application.core.domain.Address
import com.rhieda.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import org.springframework.stereotype.Component

@Component
class FindAddressByZipCodeAdapter(
    private val findAddressByZipCodeClient: FindAddressByZipCodeClient
): FindAddressByZipCodeOutputPort {
//    override fun find(zipCode: String): Address {
//        var addressResponse = findAddressByZipCodeClient.find(zipCode = zipCode)
//        return addressResponse.toAddress()
//    }
    override fun find(zipCode: String): Address = findAddressByZipCodeClient.find(zipCode).toAddress()
}