package com.groupeonepoint.kotlinforeveryone;

public class JavaPerson {

    private String name;
    private Integer age;
    private Boolean isBrazilian;

    // Generated avec Intellij
    public JavaPerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBrazilian() {
        return isBrazilian;
    }

    public void setBrazilian(Boolean brazilian) {
        isBrazilian = brazilian;
    }

    @Override
    public String toString() {
        return "JavaPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isBrazilian=" + isBrazilian +
                '}';
    }
}