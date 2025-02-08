package org.arecap.codility.lesson01;


public class FindOddOccurrence {

    public int findOddOccurrence(int[] A) {
        int result = 0;
        
        // XOR operation cancels out even occurrences, leaving the odd-occurring element
        for (int num: A) {
            result ^= num;
        }
        return result;
    }

}
