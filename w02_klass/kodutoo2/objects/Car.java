package com.oop21.w02.kodutoo2.objects;

public class Car {

    private String name;
    private String model;
    private String color;
    private String location;
    private int year;
    private int price;


    public Car(String name, String model, String color, String location, int year, int price) {
        this.setName(name);
        this.setModel(model);
        this.setColor(color);
        this.setLocation(location);
        this.setYear(year);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
