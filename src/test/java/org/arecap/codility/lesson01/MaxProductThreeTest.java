package org.arecap.codility.lesson01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxProductThreeTest {

    @Test
    public void testMaxProductOfThree_PositiveNumbers() {
        MaxProductThree maxProductThree = new MaxProductThree();
        int[] input = {1, 2, 3, 4, 5};
        int expected = 60; // 3 * 4 * 5
        assertEquals(expected, maxProductThree.maxProductOfThree(input));
    }

    @Test
    public void testMaxProductOfThree_NegativeNumbers() {
        MaxProductThree maxProductThree = new MaxProductThree();
        int[] input = {-10, -10, 1, 3, 2};
        int expected = 300; // -10 * -10 * 3
        assertEquals(expected, maxProductThree.maxProductOfThree(input));
    }

    @Test
    public void testMaxProductOfThree_MixedNumbers() {
        MaxProductThree maxProductThree = new MaxProductThree();
        int[] input = {-10, -10, 5, 2, 1};
        int expected = 500; // -10 * -10 * 5
        assertEquals(expected, maxProductThree.maxProductOfThree(input));
    }

    @Test
    public void testMaxProductOfThree_AllNegativeNumbers() {
        MaxProductThree maxProductThree = new MaxProductThree();
        int[] input = {-5, -6, -4, -8, -7, -10};
        int expected = -120; // -4 * -5 * -6
        assertEquals(expected, maxProductThree.maxProductOfThree(input));
    }

    @Test
    public void testMaxProductOfThree_SingleNegativeNumber() {
        MaxProductThree maxProductThree = new MaxProductThree();
        int[] input = {1, 2, 3, -1};
        int expected = 6; // 1 * 2 * 3
        assertEquals(expected, maxProductThree.maxProductOfThree(input));
    }
    
}