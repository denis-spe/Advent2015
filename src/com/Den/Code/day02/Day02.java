package com.Den.Code.day02;

import com.Den.Code.day02.Box;
import com.Den.Code.day02.Ribbon;
import com.Den.FileRead;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Day02 extends FileRead {
    /**
     * The constructor assigns filePath string to class fileContent
     * @param filePath location of the file
     */
    public Day02(String filePath) throws FileNotFoundException {
        super(filePath);
    }

    private ArrayList<Integer> squareFeetArray() throws FileNotFoundException {

        // Assign the readPreservedNewLine: dimensions
        ArrayList dimensions = this.readPreservedNewLine();

        // Store the dimension in different arraylist
        ArrayList<Integer> dimensionArray = new ArrayList<>();

        // Initialize the Box instance
        Box box = new Box();

        // loop through the dimensions in the PreservedNewLine
        for (int i=0; i<dimensions.size(); i++){
            // Get the parsed dimensions
            LinkedList<Integer> dimension = box.dimension(dimensions.get(i).toString());

            // Assign the dimensions
            int length = dimension.get(0);
            int width = dimension.get(1);
            int height = dimension.get(2);

            // Add total square feet to the dimensionArray
            dimensionArray.add(box.totalSquareFeet(length, width, height));

        }
        return dimensionArray;
    }

    private ArrayList<Integer> FeetArray() throws FileNotFoundException {

        // Assign the readPreservedNewLine: dimensions
        ArrayList dimensions = this.readPreservedNewLine();

        // Store the dimension in different arraylist
        ArrayList<Integer> dimensionArray = new ArrayList<>();

        // Initialize the Ribbon instance
        Ribbon ribbon = new Ribbon();

        // loop through the dimensions in the PreservedNewLine
        for (int i=0; i<dimensions.size(); i++){
            // Get the parsed dimensions
            LinkedList<Integer> dimension = ribbon.dimension(dimensions.get(i).toString());

            // Assign the dimensions
            int length = dimension.get(0);
            int width = dimension.get(1);
            int height = dimension.get(2);

            // Add total square feet to the dimensionArray
            dimensionArray.add(ribbon.totalFeet(length, width, height));

        }
        return dimensionArray;
    }

    public int partOne() throws FileNotFoundException {
        // Sum all the values in the squareFeetArray
        int sum = 0;

        // loop over the squareFeetArray
        for (int i=0; i<this.squareFeetArray().size(); i++){
            sum += this.squareFeetArray().get(i);
        }
        return sum;
    }

    public int partTwo() throws FileNotFoundException {
        // Sum all the values in the squareFeetArray
        int sum = 0;

        // loop over the squareFeetArray
        for (int i=0; i<this.FeetArray().size(); i++){
            sum += this.FeetArray().get(i);
        }
        return sum;
    }
}
