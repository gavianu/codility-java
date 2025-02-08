package org.arecap.codility.lesson01;

public class FindMissingNumber {

    public int findMissingNumber(int[] A)  {
        int n = A.length + 1;
        int expectedSum = n * (n + 1) / 2;
        for (int num: A) {
            expectedSum -= num;
        }
        return expectedSum;
    }

}
