package com.Den;

import com.Den.Code.Day01;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        /*
          ***** Day01 ****
         */
        System.out.println("Day01");
        //////// Part One \\\\\\\
        // Initializing the FileRead Class
	    FileRead day01Inputs = new FileRead("../advent2015/src/com/Den/inputs/day01.txt");
        Day01 day01 = new Day01();
        System.out.println(day01.partOne(String.valueOf(day01Inputs)));

        //////// Part Two \\\\\\\
        System.out.println(day01.partTwo(String.valueOf(day01Inputs)));

        /*
         ***** Day01 ****
         */
        //////// Part One \\\\\\\
        // Initializing the FileRead Class
        FileRead fileRead = new FileRead("../advent2015/src/com/Den/inputs/day01.txt");



        //////// Part Two \\\\\\\
    }
}
