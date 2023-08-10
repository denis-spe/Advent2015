package com.Den.TestCode;
import com.Den.Code.Day02Files.Box;
import com.Den.Code.Day02Files.Present;
import com.Den.Code.Day02Files.PresentRibbon;
import com.Den.Code.Day02Files.Ribbon;
import org.junit.*;
import java.util.LinkedList;
import static org.junit.Assert.*;

public class TestDay02 {

    // ====== Part One variables =======
    // Initialize the test variable
    final String DIMENSION_1 = "2x3x4";
    final String DIMENSION_2 = "1x1x10";


    // TestCase
    LinkedList<Integer> testCaseList_1;
    LinkedList<Integer> testCaseList_2;

    // Initialize the class
    Present box1;
    Present box2;
    PresentRibbon ribbon1;
    PresentRibbon ribbon2;

    // ======= Part Two variables ======
    final String p1_DIMENSION_1 = "2x3x4";
    final String P1_DIMENSION_2 = "1x1x10";

    // ===== Method Initializer ======
    @Before
    public void setUp(){
        // ====== Part One Instance ======
        // Assign the Box instance
        box1 = new Box();
        box2 = new Box();

        // Assign the LinkedList instance
        testCaseList_1 = new LinkedList<>();
        testCaseList_2 = new LinkedList<>();

        // Assign the Ribbon instance.
        ribbon1 = new Ribbon();
        ribbon2 = new Ribbon();

        // ====== Part Two Instance ======
    }

    // ====== Part One Methods ======
    @Test
    public void testDimension(){
        // Add Values in the testCase
        testCaseList_1.add(2);
        testCaseList_1.add(3);
        testCaseList_1.add(4);

        testCaseList_2.add(1);
        testCaseList_2.add(1);
        testCaseList_2.add(10);

        // Test returned dimension
        assertEquals(box1.dimension(DIMENSION_1), testCaseList_1);
        assertEquals(box2.dimension(DIMENSION_2), testCaseList_2);

        assertEquals(ribbon1.dimension(DIMENSION_1), testCaseList_1);
        assertEquals(ribbon2.dimension(DIMENSION_2), testCaseList_2);

    }

    @Test
    public void testSurfaceArea(){
        // Test returned integer from the surface area method
        assertEquals(box1.surfaceArea(2, 3, 4), 52);
        assertEquals(box2.surfaceArea(1, 1, 10), 42);
    }

    @Test
    public void testSquareFeet(){
        // Test returned integer from square feet method
        assertEquals(box1.smallestSide(2, 3, 4), 6);
        assertEquals(box2.smallestSide(1, 1, 10), 1);
    }

    @Test
    public void testTotalSquareFeet(){
        // Test returned integer from the total square feet method
        assertEquals(box1.totalSquareFeet(2, 3, 4), 58);
        assertEquals(box2.totalSquareFeet(1, 1, 10), 43);
    }

    @Test
    public void testFeetToWarpPresent(){
//        assertEquals(ribbon1.feetToWarpPresent(2, 3, 4), 10);
//        assertEquals(ribbon1.feetToWarpPresent(1, 1, 10), 4);


        assertEquals(ribbon1.feetToWarpPresent(27, 26, 11), 74);
        assertEquals(ribbon1.feetToWarpPresent(3, 2, 22), 10);
        assertEquals(ribbon1.feetToWarpPresent(14, 3, 5), 16);
        assertEquals(ribbon1.feetToWarpPresent(10, 9, 8), 34);
    }

    @Test
    public void testFeetToBowRibbon(){
        assertEquals(ribbon1.feetToBowRibbon(2, 3, 4), 24);
        assertEquals(ribbon1.feetToBowRibbon(1, 1, 10), 10);

        assertEquals(ribbon1.feetToBowRibbon(27, 26, 11), 7722);
        assertEquals(ribbon1.feetToBowRibbon(3, 2, 22), 132);
        assertEquals(ribbon1.feetToBowRibbon(14, 3, 5), 210);
        assertEquals(ribbon1.feetToBowRibbon(10, 9, 8), 720);
    }

    @Test
    public void testTotalFeet(){
        assertEquals(ribbon1.totalFeet(2, 3, 4), 34);
        assertEquals(ribbon1.totalFeet(1, 1, 10), 14);
    }
}
