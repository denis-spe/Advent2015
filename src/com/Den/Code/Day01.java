package com.Den.Code;


public class Day01{
    /**
     * The method will look for the floor where santa will
     * end up on
     * @param contents String of parenthesis
     * @return floor number where santa will on
     */
    public int partOne(String contents){
        /*
        Santa is trying to deliver presents in a large apartment building,
        but he can't find the right floor - the
        directions he got are a little confusing. He starts on the ground floor (floor 0) and then follows
        the instructions one character at a time.
        An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ),
        means he should go down one floor.partment building is very tall, and the basement is very deep;
        he will never find the top or bottom floors.
         */

        // floor will be used to assign the floor where santa will be
        int floor = 0;

        // Length of contents
        int length = contents.length();

        // loop over the contents
        for(int i = 0; i < length; i++){
            if (contents.charAt(i) == '('){
                floor += 1;
            }
            else {
                floor -= 1;
            }
        }
        return floor;
    }

}
