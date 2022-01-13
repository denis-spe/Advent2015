package com.Den.TestCode;
import com.Den.Code.Day01;
import org.junit.*;
import static org.junit.Assert.*;

public class TestDay01 {
    Day01 day01;
    @Before
    public void setUp(){
        day01 = new Day01();
    }

    @Test
    public void testDay01(){
        /*
          ******* PartOne Test Case *********
         */
        // First Test
        assertEquals(day01.partOne("(())"), 0);

        // Second Test
        assertEquals(day01.partOne("()()"), 0);

        // Third Test
        assertEquals(day01.partOne("((("), 3);

        // fourth Test
        assertEquals(day01.partOne("(()(()("), 3);

        // fifth Test
        assertEquals(day01.partOne("))((((("), 3);

        // Sixth Test
        assertEquals(day01.partOne("())"), -1);

        // Seventh Test
        assertEquals(day01.partOne("))("), -1);

        // eighth Test
        assertEquals(day01.partOne(")))"), -3);

        // ninth Test
        assertEquals(day01.partOne(")())())"), -3);

        /*
         ******* PartTwo Test Case *********
         */
        // One Test
        assertEquals(day01.partTwo(")))"), 1);

        // Two Test
        assertEquals(day01.partTwo(")"), 1);

        // Three Test
        assertEquals(day01.partTwo("()())"), 5);


    }

}
