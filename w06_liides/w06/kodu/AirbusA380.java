package com.oop21.w06.kodu;

public class AirbusA380 extends Airplane implements ConventionalTakeoff{
    @Override
    public void type() {
        System.out.println("| Airplane | Airbus A380");
    }

    @Override
    public void isConventionalTakeoff() {
        System.out.println("Airbus A350 | Conventional take-off |");
    }
}
