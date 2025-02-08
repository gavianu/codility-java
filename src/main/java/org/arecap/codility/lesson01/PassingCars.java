
package org.arecap.codility.lesson01;


class PassingCars {
    
    public int countPassingCars(int[] A) {
        int count = 0;      // Count of passing cars
        int eastCars = 0;   // Count of cars traveling east (0s)
    
        for (int car : A) {
            if (car == 0) {
                eastCars++;  // Count each eastbound car
            } else {
                count += eastCars;  // Every westbound car pairs with all previous eastbound cars
                if (count > 1000000000) return -1;  // Check constraint limit
            }
        }
    
        return count;
    }    

}
