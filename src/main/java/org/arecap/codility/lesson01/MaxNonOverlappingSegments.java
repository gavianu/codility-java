package org.arecap.codility.lesson01;


public class MaxNonOverlappingSegments {

    public int maxNonOverlappingSegments(int[] A, int[] B) {
        int N = A.length;
        if (N == 0) return 0;  // Edge case: No segments
        
        int count = 1; // At least one segment is chosen
        int end = B[0]; // The end of the last selected segment
    
        for (int i = 1; i < N; i++) {
            if (A[i] > end) { // If the next segment starts after the previous one ends
                count++; // Select this segment
                end = B[i]; // Update the end point
            }
        }
    
        return count;
    }    

}
