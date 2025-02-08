package org.arecap.codility.lesson01;


class EquilibriumIndex {

    public int findEquilibriumIndex(int[] A) {
        int totalSum = 0;
        for (int num : A) {
            totalSum += num;  // Compute total sum of the array
        }
        
        int leftSum = 0;
        for (int i = 0; i < A.length; i++) {
            // Check if Left Sum == Right Sum (derived from formula)
            if (leftSum == totalSum - leftSum - A[i]) {
                return i;
            }
            
            leftSum += A[i];  // Update left sum for next iteration
        }
        
        return -1;  // No equilibrium index found
    }    

}
