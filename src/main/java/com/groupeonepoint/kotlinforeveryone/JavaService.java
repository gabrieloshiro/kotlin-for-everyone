package com.groupeonepoint.kotlinforeveryone;

import org.springframework.stereotype.Service;

@Service
public class JavaService {

    public String getJavaGreeting() {
        return "Hello from Java!";
    }

    public JavaPerson getJavaPerson() {
        return new JavaPerson("Bertrand", 25);
    }
}
