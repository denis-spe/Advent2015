package com.Den;
import com.Den.Code.Day01;
import org.junit.*;
import static org.junit.Assert.*;

public class TestCode {
    Day01 day01;
    @Before
    public void testBefore(){
        day01 = new Day01();
    }

    @Test
    public void testDay01(){
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
    }

}
