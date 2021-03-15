package com.oop21.w06.kodu;

public class RobinsonR44 extends Helicopter implements VerticalTakeoff {
    @Override
    public void type() {
        System.out.println("| Helicopter | Robinson R44");
    }

    @Override
    public void isVerticalTakeoff() {
        System.out.println("Robinson R44 | Vertical take-off |");
    }
}
