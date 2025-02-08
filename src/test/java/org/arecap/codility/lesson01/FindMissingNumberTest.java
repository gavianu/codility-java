package org.arecap.codility.lesson01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindMissingNumberTest {
    
        @Test
        public void testFindMissingNumber() {
            FindMissingNumber finder = new FindMissingNumber();
            assertEquals(4, finder.findMissingNumber(new int[]{1, 2, 3, 5}));
            assertEquals(1, finder.findMissingNumber(new int[]{2, 3, 4, 5}));
            assertEquals(5, finder.findMissingNumber(new int[]{1, 2, 3, 4}));
            assertEquals(2, finder.findMissingNumber(new int[]{1, 3, 4, 5}));
            assertEquals(3, finder.findMissingNumber(new int[]{1, 2, 4, 5}));
        }

        @Test
        public void testFindMissingNumberEmptyArray() {
            FindMissingNumber finder = new FindMissingNumber();
            assertEquals(1, finder.findMissingNumber(new int[]{}));
        }

        @Test
        public void testFindMissingNumberSingleElement() {
            FindMissingNumber finder = new FindMissingNumber();
            assertEquals(2, finder.findMissingNumber(new int[]{1}));
            assertEquals(1, finder.findMissingNumber(new int[]{2}));
        }



}
