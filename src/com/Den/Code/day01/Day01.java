package com.Den.Code.day01;


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
        directions he got are a little confusing. He starts on the first floor (floor 0) and then follows
        the instructions one character at a time.
        An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ),
        means he should go down one-floor.apartment building is very tall, and the basement is very deep;
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
    public int partTwo(String contents){
        /*
        In this part, The problem will be to find the position
        of the first character that causes santa to enter the basement
         */
        // length of character in the contents
        int length = contents.length();

        // The floor to start on is 0
        int floor = 0;

        // Position which lead them to basement
        int position = 0;

        // Loop over the contents
        for (int i=0; i<length; i++){
            if (contents.charAt(i) == '('){
                floor += 1;
            }
            else{
                floor -= 1;
            }
            if (floor < 0){
                position += i;
                return position + 1;
            }
        }
        return position;
    }

}
