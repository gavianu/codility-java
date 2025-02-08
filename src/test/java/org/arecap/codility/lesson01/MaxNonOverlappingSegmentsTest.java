package org.arecap.codility.lesson01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxNonOverlappingSegmentsTest {

    @Test
    public void testMaxNonOverlappingSegments() {
        MaxNonOverlappingSegments solution = new MaxNonOverlappingSegments();

        int[] A1 = {1, 3, 7, 9, 9};
        int[] B1 = {5, 6, 8, 9, 10};
        assertEquals(3, solution.maxNonOverlappingSegments(A1, B1));

        int[] A2 = {1, 2, 3, 4, 5};
        int[] B2 = {5, 5, 5, 5, 5};
        assertEquals(1, solution.maxNonOverlappingSegments(A2, B2));

        int[] A3 = {1, 2, 3, 4, 5};
        int[] B3 = {1, 2, 3, 4, 5};
        assertEquals(5, solution.maxNonOverlappingSegments(A3, B3));

        int[] A4 = {};
        int[] B4 = {};
        assertEquals(0, solution.maxNonOverlappingSegments(A4, B4));

        int[] A5 = {1, 3, 7};
        int[] B5 = {2, 6, 8};
        assertEquals(3, solution.maxNonOverlappingSegments(A5, B5));
    }
}