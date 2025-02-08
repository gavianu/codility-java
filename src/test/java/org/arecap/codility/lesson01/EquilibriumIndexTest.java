package org.arecap.codility.lesson01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EquilibriumIndexTest {

    @Test
    public void testFindEquilibriumIndex() {
        EquilibriumIndex eq = new EquilibriumIndex();
        
        assertEquals(3, eq.findEquilibriumIndex(new int[]{-7, 1, 5, 2, -4, 3, 0}));
        assertEquals(2, eq.findEquilibriumIndex(new int[]{1, -1, 0}));
        assertEquals(-1, eq.findEquilibriumIndex(new int[]{1, 2, 3}));
        assertEquals(0, eq.findEquilibriumIndex(new int[]{0, 1, -1}));
        assertEquals(-1, eq.findEquilibriumIndex(new int[]{}));
    }
    
}
