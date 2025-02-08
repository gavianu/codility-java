package org.arecap.codility.lesson01;

import java.util.Arrays;

public class MaxProductThree {

    public int maxProductOfThree(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        
        int productWithNegatives = A[0] * A[1] * A[n - 1]; // Two smallest + largest
        int productWithPositives = A[n - 3] * A[n - 2] * A[n - 1]; // Three largest
        
        return Math.max(productWithNegatives, productWithPositives);
    }

}
