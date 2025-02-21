package org.arecap.codility.exercise01;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;



public class ThreeLettersTest {
    
    @Test
    public void testExampleCases() {
        ThreeLetters threeLetters = new ThreeLetters();
        assertTrue(isValid(threeLetters.solution(5, 3), 5, 3));
        assertTrue(isValid(threeLetters.solution(3, 3), 3, 3));
        assertTrue(isValid(threeLetters.solution(1, 4), 1, 4));
    }

    @Test
    public void testEdgeCases() {
        ThreeLetters threeLetters = new ThreeLetters();
        assertTrue(isValid(threeLetters.solution(0, 5), 0, 5));
        assertTrue(isValid(threeLetters.solution(5, 0), 5, 0));
        assertTrue(isValid(threeLetters.solution(2, 2), 2, 2));
        assertTrue(isValid(threeLetters.solution(6, 2), 6, 2));
        assertTrue(isValid(threeLetters.solution(2, 6), 2, 6));
    }

    @Test
    public void testLargeNumbers() {
        ThreeLetters threeLetters = new ThreeLetters();
        assertTrue(isValid(threeLetters.solution(100, 50), 100, 50));
        assertTrue(isValid(threeLetters.solution(50, 100), 50, 100));
        assertTrue(isValid(threeLetters.solution(100, 100), 100, 100));
    }

    /**
     * Helper function to validate the result:
     * - The total count of 'a' and 'b' must match A and B.
     * - The string must not contain "aaa" or "bbb".
     */
    private boolean isValid(String result, int expectedA, int expectedB) {
        int countA = 0, countB = 0;
        
        for (char c : result.toCharArray()) {
            if (c == 'a') countA++;
            if (c == 'b') countB++;
        }

        // Check if the count matches
        if (countA != expectedA || countB != expectedB) return false;

        // Check if "aaa" or "bbb" appears
        if (expectedB > 0 && result.contains("aaa")) return false;
        if (expectedA > 0 && result.contains("bbb")) return false;

        return true;
    }

}