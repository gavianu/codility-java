package org.arecap.codility.lesson01;

public class MaxProfit {
    
    public int maxProfit(int[] A) {
        int maxProfit = 0; // Store the maximum profit found
        int minPrice = Integer.MAX_VALUE; // Store the minimum price seen so far

        for (int price : A) {
            minPrice = Math.min(minPrice, price); // Update min price if lower found
            maxProfit = Math.max(maxProfit, price - minPrice); // Update max profit if better found
        }

        return maxProfit;
    }

}
