package com.Den;

import com.Den.Code.Day01;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        /*
          ***** Day01 ****
         */
        // Initializing the FileRead Class
	    FileRead fileRead = new FileRead("/Volumes/LocalDiskB/JavaFiles/advent2015/src/com/Den/inputs/day01.txt");
        Day01 day01 = new Day01();
        System.out.println(day01.partOne(String.valueOf(fileRead)));
    }
}
