package com.Den.Code.day03;

import java.util.ArrayList;

import static com.Den.Code.day03.Distance.*;

public class Movement {
    /*
    Class variable
     */
    private final char[] charArray;

    /*
    Class constructor
     */
    public Movement(String distances){
        charArray = distances.toCharArray();
    }

    /**
     * Change the arrows to distances as word
     * @return ArrayList of distance
     */
    public final ArrayList<Distance> distances() throws Exception {
        // Initializer the distance ArrayList
        ArrayList<Distance> distanceArrayList = new ArrayList<>();

        // loop over the character of the char array
        for (char c : this.charArray) {
            switch (c) {
                case '>':
                    distanceArrayList.add(EAST);
                    break;
                case '<':
                    distanceArrayList.add(WEST);
                    break;
                case '^':
                    distanceArrayList.add(NORTH);
                    break;
                case 'v':
                    distanceArrayList.add(SOUTH);
                    break;
                default:
                    throw new Exception("Distance doesn't Exists");
            }
        }

        return distanceArrayList;
    }
}
