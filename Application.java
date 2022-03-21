package com.company;

public class Application {
    // Returning the total volume of the geometric objects
    public double get_total_volume(VolumeCalculator[] geo_objects)
    {
        // Variable used to store total volume
        double vol_sum = 0;

        // Iteratively calculating the volume of each Cuboid
        // and adding it to the total volume

        // Iterating using for each loop to
        // calculate the volume of a cuboid
        for (VolumeCalculator geo_object : geo_objects) {

            vol_sum += geo_object.volumeCalculation();
        }

        // Returning the to total volume
        return vol_sum;
    }
}