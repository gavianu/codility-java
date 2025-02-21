package org.arecap.codility.exercise01;

public class ParityDegree {
    
    public int highestPowerOf2Divides(int N) {
        int k = 0;
        while (N % (1 << k) == 0) {
            k++;
        }
        return k - 1;
    }

}
