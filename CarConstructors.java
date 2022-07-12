package com.n3.ObjectsAndClasses;

public class Car {
    private String brand;
    private String model;
    private int horePower;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorePower() {
        return horePower;
    }

    public void setHorePower(int horePower) {
        this.horePower = horePower;
    }

    public Car(String brand, String model, int horePower) {
        this.brand = brand;
        this.model = model;
        this.horePower = horePower;
    }

    public Car (String brand, String model) {
        this(brand,model,-1);
    }

    public Car (String brand,int horePower) {
        this(brand,"unknown",horePower);
    }

    public Car(String brand) {
        this(brand,"unknown",-1);
    }

    @Override
    public String toString() {

        return String.format("The car is :%s, %s, %s",
                this.getBrand(),
                this.getModel(),
                this.getHorePower()
                );
    }
}
