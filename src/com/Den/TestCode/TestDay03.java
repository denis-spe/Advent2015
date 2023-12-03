package com.Den.TestCode;

import com.Den.Code.day03.Distance;
import com.Den.Code.day03.Movement;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.Den.Code.day03.Distance.*;
import static org.junit.Assert.*;

public class TestDay03 {
    /*
    Declare the movement
     */
    Movement firstMovement,
            secondMovement,
            thirdMovement;
    @Before
    public void setUp(){
        /*
        Initializer the movement
         */
        firstMovement = new Movement(">");
        secondMovement = new Movement("^>v<");
        thirdMovement = new Movement("^v^v^v^v^v");
    }

    @Test
    public void testDistances() throws Exception {
        /*
        First movement test case
         */
        assertEquals(firstMovement.distances().get(0), EAST);

        /*
        Second movement test case
         */
        Distance[] secondTestCaseArray = {NORTH, EAST, SOUTH, WEST};
        ArrayList<Distance> secondTestCaseArrayList = new ArrayList<>(
                Arrays.asList(secondTestCaseArray)
        );
        assertEquals(secondMovement.distances(), secondTestCaseArrayList);

        /*
        Third movement test case
         */
        Distance[] thirdTestCaseArray = {NORTH, SOUTH, NORTH, SOUTH, NORTH, SOUTH,
                NORTH, SOUTH, NORTH, SOUTH
        };
        ArrayList<Distance> thirdTestCaseArrayList = new ArrayList<>(
                Arrays.asList(thirdTestCaseArray)
        );
        assertEquals(thirdMovement.distances(), thirdTestCaseArrayList);

    }
}
