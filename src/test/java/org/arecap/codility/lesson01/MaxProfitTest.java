package org.arecap.codility.lesson01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxProfitTest {

    @Test
    public void testMaxProfit() {
        MaxProfit maxProfit = new MaxProfit();

        assertEquals(0, maxProfit.maxProfit(new int[] {}));
        assertEquals(0, maxProfit.maxProfit(new int[] {5}));
        assertEquals(0, maxProfit.maxProfit(new int[] {5, 4, 3, 2, 1}));
        assertEquals(4, maxProfit.maxProfit(new int[] {1, 2, 3, 4, 5}));
        assertEquals(3, maxProfit.maxProfit(new int[] {1, 2, 3, 0, 2, 3}));
        assertEquals(5, maxProfit.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
        assertEquals(0, maxProfit.maxProfit(new int[] {7, 6, 4, 3, 1}));
    }
    
}