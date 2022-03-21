package com.company;

public class Cuboid implements VolumeCalculator{
    // Member variables of this class
    private double length;
    private double breadth;
    private double height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double volumeCalculation() {
        return this.length*this.breadth*this.height;
    }
}