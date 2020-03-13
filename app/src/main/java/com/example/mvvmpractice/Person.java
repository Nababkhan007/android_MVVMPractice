package com.example.mvvmpractice;

public class Person {
    private String personName;
    private int personAge;
    private String personAddress;

    public Person(String personName, int personAge, String personAddress) {
        this.personName = personName;
        this.personAge = personAge;
        this.personAddress = personAddress;
    }

    public String getPersonName() {
        return personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public String getPersonAddress() {
        return personAddress;
    }
}
