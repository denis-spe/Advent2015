package com.Den;

import com.Den.Code.Day01;
import com.Den.Code.Day02;
import com.Den.Code.Day02Files.Ribbon;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        /*
         ***** Day01 ****
         */
        System.out.println("==== Day01 ====");
        //////// Part One \\\\\\\
        // Initializing the FileRead Class
        FileRead day01Inputs = new FileRead("../advent2015/src/com/Den/inputs/day01.txt");
        Day01 day01 = new Day01();
        System.out.println("Part 1: " + day01.partOne(String.valueOf(day01Inputs)));

        //////// Part Two \\\\\\\
        System.out.println("Part 2: "  + day01.partTwo(String.valueOf(day01Inputs)));

        /*
         ***** Day02 ****
         */
        System.out.println("==== Day02 ====");
        //////// Part One \\\\\\
        Day02 day02 = new Day02("../advent2015/src/com/Den/inputs/day02.txt");
        System.out.println("Part 1: " + day02.partOne());
        //////// Part Two \\\\\\
        System.out.println("Part 2: " + day02.partTwo());

    }
}
