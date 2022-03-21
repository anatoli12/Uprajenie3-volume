package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String args[])
    {
        // Initializing a cuboid one as well as declaring
        // its dimensions.
        Cuboid cb1 = new Cuboid(5,10,15);

        // Initializing a cuboid two as well as declaring
        // its dimensions.
        Cuboid cb2 = new Cuboid(2,4,6);

        ////Initializing a cuboid three as well as declaring
        /// its dimensions.
        Cuboid cb3 = new Cuboid(3,12,15);

        // Initializing and declaring an array of cuboids
       ArrayList<VolumeCalculator> arr = new ArrayList<>();
        arr.add(cb1);
        arr.add(cb2);
        arr.add(cb3);

        // Initializing a sphere one as well as declaring
        // its dimension.
        Sphere sp1 = new Sphere(5);

        // Initializing a sphere two as well as declaring
        // its dimension.
        Sphere sp2 = new Sphere(2);

        // Initializing a sphere three as well as declaring
        // its dimension.
        Sphere sp3 = new Sphere(3);

        // Initializing and declaring an array of spheres
        arr.add(sp1);
        arr.add(sp2);
        arr.add(sp3);

        // Initializing Application class
        Application app = new Application();

        // Getting the total volume
        // using get_total_volume
        double vol = app.get_total_volume(arr.toArray(new VolumeCalculator[0]));

        // Print and display the total volume
        System.out.println("The total volume is " + vol);
    }
}
