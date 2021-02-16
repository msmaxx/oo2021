package com.oop21.w02.kodutoo2;

import com.oop21.w02.kodutoo2.objects.Car;

public class Main {

    public static void main(String[] args) {

        Car car01 = new Car("Toyota", "Camry", "White", "Tallinn, Estonia", 2006, 5600);
        System.out.println("Car: " + car01.getName() + " " + car01.getModel() + " Color: " + car01.getColor() + " Location: " + car01.getLocation() + " Year: " + car01.getYear() + " Price: " + car01.getPrice());
    }

}
