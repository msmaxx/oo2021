package com.oop21.w10.kodu;

import java.util.StringJoiner;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("first: '" + name + "'")
                .toString();
    }
}
