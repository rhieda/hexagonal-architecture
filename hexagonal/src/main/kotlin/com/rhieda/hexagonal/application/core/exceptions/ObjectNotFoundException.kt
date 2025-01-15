package com.rhieda.hexagonal.application.core.exceptions

import java.lang.RuntimeException

class ObjectNotFoundException(message: String): RuntimeException(message) {
}