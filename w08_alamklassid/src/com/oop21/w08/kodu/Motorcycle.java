package com.oop21.w08.kodu;

public class Motorcycle {

    private String brandName;
    private String model;
    private int weight;
    private String color;
    private int year;
    private int maxSpeed;

    public Motorcycle(String brandName, String model, int weight, String color, int year, int maxSpeed) {
        this.brandName = brandName;
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
