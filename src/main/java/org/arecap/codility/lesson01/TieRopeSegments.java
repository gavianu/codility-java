package org.arecap.codility.lesson01;


public class TieRopeSegments {

    public int countRopes(int K, int[] A) {
        int count = 0;   // Count of valid ropes
        int length = 0;  // Current accumulated rope length
    
        for (int rope : A) {
            length += rope;  // Add current rope length
            
            // If the accumulated length reaches or exceeds K, we count it
            if (length >= K) {
                count++;
                length = 0;  // Reset length for the next rope
            }
        }
    
        return count;
    }
    
}
