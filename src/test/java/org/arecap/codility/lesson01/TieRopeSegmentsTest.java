package org.arecap.codility.lesson01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class TieRopeSegmentsTest {

    @Test
    public void testCountRopes() {
        TieRopeSegments tieRopeSegments = new TieRopeSegments();

        assertEquals(3, tieRopeSegments.countRopes(4, new int[]{1, 2, 3, 4, 1, 1, 3}));
        assertEquals(1, tieRopeSegments.countRopes(5, new int[]{1, 2, 3}));
        assertEquals(1, tieRopeSegments.countRopes(5, new int[]{5}));
        assertEquals(3, tieRopeSegments.countRopes(3, new int[]{1, 2, 1, 2, 1, 2}));
        assertEquals(0, tieRopeSegments.countRopes(10, new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }
}