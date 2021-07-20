package com.groupeonepoint.kotlinforeveryone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

    private final JavaService javaService;

    public JavaController(JavaService javaService) {
        this.javaService = javaService;
    }

    @RequestMapping("/java")
    public String helloFromJava() {
        return javaService.getJavaGreeting();
    }

    @RequestMapping("/java/person")
    public JavaPerson getJavaPerson() {
        return javaService.getJavaPerson();
    }

}
