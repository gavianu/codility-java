package org.arecap.codility.lesson01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinMaxDivisionTest {

    @Test
    public void testMinMaxDivisionExample1() {
        MinMaxDivision minMaxDivision = new MinMaxDivision();
        int K = 3;
        int M = 5;
        int[] A = {2, 1, 5, 1, 2, 2, 2};
        int result = minMaxDivision.minMaxDivision(K, M, A);
        assertEquals(6, result);
    }

    @Test
    public void testMinMaxDivisionExample2() {
        MinMaxDivision minMaxDivision = new MinMaxDivision();
        int K = 2;
        int M = 5;
        int[] A = {2, 1, 5, 1, 2, 2, 2};
        int result = minMaxDivision.minMaxDivision(K, M, A);
        assertEquals(8, result);
    }

    @Test
    public void testMinMaxDivisionSingleElement() {
        MinMaxDivision minMaxDivision = new MinMaxDivision();
        int K = 1;
        int M = 5;
        int[] A = {5};
        int result = minMaxDivision.minMaxDivision(K, M, A);
        assertEquals(5, result);
    }

    @Test
    public void testMinMaxDivisionAllElementsSame() {
        MinMaxDivision minMaxDivision = new MinMaxDivision();
        int K = 3;
        int M = 5;
        int[] A = {5, 5, 5, 5, 5};
        int result = minMaxDivision.minMaxDivision(K, M, A);
        assertEquals(10, result);
    }

    @Test
    public void testMinMaxDivisionLargeK() {
        MinMaxDivision minMaxDivision = new MinMaxDivision();
        int K = 10;
        int M = 5;
        int[] A = {2, 1, 5, 1, 2, 2, 2};
        int result = minMaxDivision.minMaxDivision(K, M, A);
        assertEquals(5, result);
    }

    @Test
    public void testMinMaxDivisionLargeM() {
        MinMaxDivision minMaxDivision = new MinMaxDivision();
        int K = 3;
        int M = 10;
        int[] A = {2, 1, 5, 1, 2, 2, 2};
        int result = minMaxDivision.minMaxDivision(K, M, A);
        assertEquals(6, result);
    }
}