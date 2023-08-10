package com.Den.Code.Day02Files;

import com.Den.FileRead;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;

/**
 * Ribbon is all the same width
 */
public class Ribbon implements PresentRibbon{
    /**
     * Represents feet of ribbon to wrap the present
     *
     * @param length of the present
     * @param width  of the present
     * @return feet of ribbon to wrap the present.
     */
    @Override
    public int feetToWarpPresent(int length, int width, int height) {
        ArrayList<Integer> measurement = new ArrayList<>();
        measurement.add(length);
        measurement.add(width);
        measurement.add(height);

        int firstMinValue = measurement.get(0);

        for (int value : measurement){
            if (firstMinValue > value){
                firstMinValue = value;
            }
        }
        measurement.remove((Integer) firstMinValue);

        int secondMinValue = measurement.get(0);
        for (int value : measurement){
            if (secondMinValue > value){
                secondMinValue = value;
            }
        }

        return (firstMinValue + firstMinValue) + (secondMinValue + secondMinValue);
    }

    /**
     * Represents feet of ribbon for the bow
     *
     * @param length of the present
     * @param width  of the present
     * @param height of the present
     * @return feet of the ribbon for the bow
     */
    @Override
    public int feetToBowRibbon(int length, int width, int height) {
        return length * width * height;
    }

    /**
     * A method represents dimension of the box
     *
     * @return Arraylist of dimension as integers
     */
    @Override
    public LinkedList<Integer> dimension(String stringDimension) {

        // Split a dimension by 'x'
        String[] dimensions = stringDimension.split("x");

        // Store dimensions in the Arraylist
        LinkedList<Integer> linkedDimension = new LinkedList<>();

        // loop over the dimensionsArray
        for (int i=0; i<dimensions.length; i++){
            // Add dimension to the linkedDimension
            linkedDimension.add(Integer.valueOf(dimensions[i]));
        }
        return linkedDimension;
    }

    /**
     * Return the total sum of the feet.
     *
     * @param length of the present
     * @param width  of the present
     * @param height of the present
     * @return total sum of the present
     */
    @Override
    public int totalFeet(int length, int width, int height) {
        return this.feetToBowRibbon(length, width, height) +
                this.feetToWarpPresent(height, width, length);
    }
}
