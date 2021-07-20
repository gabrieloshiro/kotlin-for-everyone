package com.groupeonepoint.kotlinforeveryone

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinController(private val kotlinService: KotlinService, private val javaService: JavaService) {

    @RequestMapping("/kotlin")
    fun helloFromKotlin(): String {
        return kotlinService.getKotlinGreeting()
    }

    @RequestMapping("/kotlin/person")
    fun getKotlinPerson(): KotlinPerson {
        return kotlinService.getKotlinPerson()
    }

    @RequestMapping("/kotlin/java")
    fun helloFromKotlinFromJava(): String {
        return javaService.javaGreeting
    }

    @RequestMapping("/kotlin/java/person")
    fun getJavaPersonFromKotlin(): JavaPerson =
        javaService.javaPerson
}