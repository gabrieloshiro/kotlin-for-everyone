package com.groupeonepoint.kotlinforeveryone

import org.springframework.stereotype.Service

@Service
class KotlinService {
    fun getKotlinGreeting(): String = "Hello from Kotlin!"
    fun getKotlinPerson(): KotlinPerson = KotlinPerson("Kotlin Bertrand", 42)
}