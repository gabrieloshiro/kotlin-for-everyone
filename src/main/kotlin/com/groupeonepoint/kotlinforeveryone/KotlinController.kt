package com.groupeonepoint.kotlinforeveryone

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinController(private val kotlinService: KotlinService) {

    @RequestMapping("/kotlin")
    fun helloFromKotlin(): String {
        return kotlinService.getKotlinGreeting()
    }

    @RequestMapping("/kotlin/person")
    fun getKotlinPerson(): KotlinPerson {
        return kotlinService.getKotlinPerson()
    }

}