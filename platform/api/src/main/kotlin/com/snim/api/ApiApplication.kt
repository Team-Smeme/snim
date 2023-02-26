package com.snim.api

import com.snim.core.CoreConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContextInitializer

@SpringBootApplication
open class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args) {
        
    }
}
