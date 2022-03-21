package com.company;

public class Sphere implements VolumeCalculator {
    // Storing radius of a sphere
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volumeCalculation() {
        return 4/3*Math.PI*this.radius*this.radius*this.radius;
    }
}