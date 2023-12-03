package com.Den.Code.day02;

import java.util.LinkedList;

public interface Present {

    // ******** class Methods ******
    /**
     * A method represents dimension of the box
     * @return Arraylist of dimension as integers
     */
    public LinkedList<Integer> dimension(String stringDimension);


    /**
     * calculate the surface of the box
     * @param length of the box
     * @param width of the box
     * @param height of the box
     * @return surface area of the box
     */
    public int surfaceArea(int length, int width, int height);

    /**
     * Calculate the square feet of the box
     * @param length of the box
     * @param width of the box
     * @return square feet of the box
     */
    int smallestSide(int length, int width, int height);

    /**
     * Add square feet to surface area
     * @param length of the box
     * @param width of the box
     * @param height of the box
     * @return total of square feet with surface area
     */
    public int totalSquareFeet(int length, int width, int height);
}
