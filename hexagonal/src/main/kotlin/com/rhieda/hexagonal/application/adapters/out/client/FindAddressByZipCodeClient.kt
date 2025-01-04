package com.rhieda.hexagonal.application.adapters.out.client

import com.rhieda.hexagonal.application.adapters.out.client.response.AddressResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "FindAddressByZipCodeClient",
    url = "\${hexagonalmock.client.address.url}"
)
interface FindAddressByZipCodeClient {
    @GetMapping("/{zipCode}")
    fun find(@PathVariable zipCode: String): AddressResponse
}