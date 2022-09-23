package com.n3.encapsulation.box;

public class Box {
    private double length;
    private double height;
    private double width;

    public Box(double length, double height, double width) {
        this.setLength(length);
        this.setHeight(height);
        this.setWidth(width);
    }

    private void ensureMinValueMet( double minValue, String paramPrefix){
        if (minValue<=0){
            throw new IllegalArgumentException(paramPrefix + "the provided data must be bigger than 0");
        }
    }

    private void setLength(double length) {
        ensureMinValueMet(length,"Length ");
        this.length = length;
    }

    private void setHeight(double height) {
        ensureMinValueMet(height,"Height");
        this.height = height;
    }

    private void setWidth(double width) {
        ensureMinValueMet(width,"Width");
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    //Box methods

    public double calculateVolume (){
        return length * width * height;
    }

    public double calculateLateralSurfaceArea (){
        return 2 * length * height +2* width * height;
    }

    public double calculateSurfaceArea (){
        return 2 * (length * width + length* height + width * height);
    }
}
