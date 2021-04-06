package com.oop21.w08.kodu;

public class Proov {

    public static void main(String[] args) {

        Car car = new Car("Mercedes-benz", "S-class", 2275, "Must", 2018, 130);
        NewCar newCar = new NewCar("Mercedes-benz", "S-class", 2275, "Must", 2018, 130);

        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 164, "Punane", 2016, 160);
        NewMotorcycle newMotorcycle = new NewMotorcycle("Kawasaki", "Ninja", 164, "Punane", 2016, 160);

        System.out.println(car.getColor());
        System.out.println(newCar.getColor());

        System.out.println(motorcycle.getBrandName());
        System.out.println(newMotorcycle.getBrandName());
    }
}
