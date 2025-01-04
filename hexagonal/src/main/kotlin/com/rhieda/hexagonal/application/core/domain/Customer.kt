package com.rhieda.hexagonal.application.core.domain

import org.apache.kafka.common.protocol.types.Field.Bool

data class Customer(
    val id: String? = null,
    val name: String,
    var address: Address? = null,
    val cpf: String,
    val isValidCpf: Boolean = false
)
