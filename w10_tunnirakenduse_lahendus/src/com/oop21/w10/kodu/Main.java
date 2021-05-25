package com.oop21.w10.kodu;

public class Main {

    public static void main(String[] args) {

        Pair<String> strings = new Pair<>("Hello", "World");
        Pair<Integer> integers = new Pair<>(55, 777);

        System.out.println(strings);
        System.out.println(integers);

        Pair<Person> people = new Pair<>(new Person("Jack"), new Person("John"));

        System.out.println(people);
    }
}
