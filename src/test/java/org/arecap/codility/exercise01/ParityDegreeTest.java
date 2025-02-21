package org.arecap.codility.exercise01;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class ParityDegreeTest {

   
    @Test
    public void testHighestPowerOf2Divides() {
        ParityDegree parityDegree = new ParityDegree();
        assertEquals(3, parityDegree.highestPowerOf2Divides(24));
        assertEquals(0, parityDegree.highestPowerOf2Divides(1));
        assertEquals(1, parityDegree.highestPowerOf2Divides(2));
        assertEquals(2, parityDegree.highestPowerOf2Divides(4));
        assertEquals(3, parityDegree.highestPowerOf2Divides(8));
        assertEquals(4, parityDegree.highestPowerOf2Divides(16));
        assertEquals(0, parityDegree.highestPowerOf2Divides(3));
        assertEquals(5, parityDegree.highestPowerOf2Divides(32));
        assertEquals(0, parityDegree.highestPowerOf2Divides(7));
        assertEquals(6, parityDegree.highestPowerOf2Divides(64));
        assertEquals(0, parityDegree.highestPowerOf2Divides(9));
        assertEquals(10, parityDegree.highestPowerOf2Divides(1024));
    }
}