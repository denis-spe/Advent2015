package com.Den.Code.day02;

import java.util.LinkedList;

public class Box implements Present{

    // ******** Methods ***************
    /**
     * A method represents dimension of the box
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
     * calculate the surface of the box
     * @param length of the box
     * @param width of the box
     * @param height of the box
     * @return surface area of the box
     */
    @Override
    public int surfaceArea(int length, int width, int height) {
        // formula = 2*l*w + 2*w*h + 2*h*l
        return 2 * length * width + 2 * width * height + 2 * height * length;
    }

    /**
     * Calculate the square feet of the box
     *
     * @param length of the box
     * @param width  of the box
     * @return square feet of the box
     */
    @Override
    public int smallestSide(int length, int width, int height) {
        int firstSide = length * width;
        int secondSide = width * height;
        int thirdSide = height * length;

        int min = Math.min(firstSide, secondSide);
        if (min < thirdSide){
            return min;
        }else {
            return thirdSide;
        }
    }

    /**
     * Add square feet to surface area
     *
     * @param length of the box
     * @param width  of the box
     * @param height of the box
     * @return total of square feet with surface area
     */
    @Override
    public int totalSquareFeet(int length, int width, int height) {
        return this.surfaceArea(length, width, height) + this.smallestSide(length, width, height);
    }
}
