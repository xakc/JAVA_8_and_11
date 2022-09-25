package com.n3.interfacesandabstraction;

public class Seat implements Car {

    String model;
    String colour;
    String country;
    int horsePower;

    public Seat(String model, String colour, String country, int horsePower) {
        this.model = model;
        this.colour = colour;
        this.country = country;
        this.horsePower = horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }
}
