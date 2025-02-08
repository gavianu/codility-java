package org.arecap.codility.lesson01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class PassingCarsTest {

    @Test
    public void testCountPassingCars() {
        PassingCars passingCars = new PassingCars();
        
        assertEquals(5, passingCars.countPassingCars(new int[]{0, 1, 0, 1, 1}));
        assertEquals(0, passingCars.countPassingCars(new int[]{0, 0, 0, 0, 0}));
        assertEquals(0, passingCars.countPassingCars(new int[]{1, 1, 1, 1, 1}));
        assertEquals(1, passingCars.countPassingCars(new int[]{0, 1}));
        assertEquals(0, passingCars.countPassingCars(new int[]{1, 0}));
        assertEquals(3, passingCars.countPassingCars(new int[]{0, 1, 1, 1}));
        assertEquals(0, passingCars.countPassingCars(new int[]{}));
    }
}