package org.arecap.codility.lesson01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class FindOddOccurrenceTest {

    @Test
    public void testFindOddOccurrence_singleElement() {
        FindOddOccurrence finder = new FindOddOccurrence();
        int[] input = {7};
        int result = finder.findOddOccurrence(input);
        assertEquals(7, result);
    }

    @Test
    public void testFindOddOccurrence_allEvenOccurrences() {
        FindOddOccurrence finder = new FindOddOccurrence();
        int[] input = {2, 2, 3, 3, 4, 4};
        int result = finder.findOddOccurrence(input);
        assertEquals(0, result); // Assuming 0 is returned when no odd occurrence is found
    }

    @Test
    public void testFindOddOccurrence_oneOddOccurrence() {
        FindOddOccurrence finder = new FindOddOccurrence();
        int[] input = {1, 2, 2, 3, 3, 1, 4};
        int result = finder.findOddOccurrence(input);
        assertEquals(4, result);
    }

    @Test
    public void testFindOddOccurrence_multipleOddOccurrences() {
        FindOddOccurrence finder = new FindOddOccurrence();
        int[] input = {1, 2, 2, 3, 3, 1, 4, 4, 5};
        int result = finder.findOddOccurrence(input);
        assertEquals(5, result);
    }

    @Test
    public void testFindOddOccurrence_emptyArray() {
        FindOddOccurrence finder = new FindOddOccurrence();
        int[] input = {};
        int result = finder.findOddOccurrence(input);
        assertEquals(0, result); // Assuming 0 is returned for an empty array
    }
}