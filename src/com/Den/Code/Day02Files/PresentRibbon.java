package com.Den.Code.Day02Files;

import java.util.LinkedList;

public interface PresentRibbon {
    /**
     * Represents feet of ribbon to wrap the present
     * @param length of the present
     * @param width of the present
     * @return feet of ribbon to wrap the present.
     */
    public int feetToWarpPresent(int length, int width, int height);

    /**
     * Represents feet of ribbon for the bow
     * @param length of the present
     * @param width of the present
     * @param height of the present
     * @return feet of the ribbon for the bow
     */
    public int feetToBowRibbon(int length, int width, int height);

    // ******** class Methods ******
    /**
     * A method represents dimension of the box
     * @return Arraylist of dimension as integers
     */
    public LinkedList<Integer> dimension(String stringDimension);

    /**
     * Return the total sum of the present.
     * @param length of the present
     * @param width of the present
     * @param height of the present
     * @return total sum of the present
     */
    public int totalFeet(int length, int width, int height);

}
