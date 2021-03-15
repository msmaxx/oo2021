package com.oop21.w06.kodu;

import com.oop21.w06.kodu.RobinsonR44;

import com.oop21.w06.kodu.AirbusA380;


public class Main {
    public static void main(String[] args){
        RobinsonR44 robinsonR44 = new RobinsonR44();
        AirbusA380 airbusA380 = new AirbusA380();

        Proov2 proov2 = new Proov2();
        Proov proov = new Proov();

        proov2.foo(robinsonR44);
        proov.foo(robinsonR44);

        proov2.foo(airbusA380);
        proov.foo(airbusA380);
    }
}
