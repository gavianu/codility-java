package org.arecap.codility.exercise01;

public class ThreeLetters {

    public String solution(int A, int B) {
        StringBuilder result = new StringBuilder();
        
        char char1 = 'a', char2 = 'b';
        int maxCount = A, minCount = B;
        
        // Ensure 'a' is the most frequent letter
        if (A < B) {
            char1 = 'b';
            char2 = 'a';
            maxCount = B;
            minCount = A;
        }
        
        while (maxCount > 0 || minCount > 0) {
            // Add two of the most frequent character if possible
            if (maxCount > 0) {
                result.append(char1);
                maxCount--;
            }
            if (maxCount > minCount) {
                result.append(char1);
                maxCount--;
            }
            
            // Add one of the less frequent character
            if (minCount > 0) {
                result.append(char2);
                minCount--;
            }
        }
        
        return result.toString();
    }

}
