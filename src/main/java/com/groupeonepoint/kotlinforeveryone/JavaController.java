package com.groupeonepoint.kotlinforeveryone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

    private final JavaService javaService;
    private final KotlinService kotlinService;

    public JavaController(JavaService javaService, KotlinService kotlinService) {
        this.javaService = javaService;
        this.kotlinService = kotlinService;
    }

    @RequestMapping("/java")
    public String helloFromJava() {
        return javaService.getJavaGreeting();
    }

    @RequestMapping("/java/person")
    public JavaPerson getJavaPerson() {
        return javaService.getJavaPerson();
    }

    @RequestMapping("/java/kotlin/")
    public String helloFromKotlinViaJava() {
        return kotlinService.getKotlinGreeting();
    }
    @RequestMapping("/java/kotlin/person")
    public KotlinPerson getKotlinPersonFromJava() {
        return kotlinService.getKotlinPerson();
    }



}
