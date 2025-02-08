package org.arecap.codility.lesson01;


class MinMaxDivision {

    public int minMaxDivision(int K, int M, int[] A) {
        int lowerBound = getMax(A);  // Minimum possible max sum (largest element)
        int upperBound = getSum(A);  // Maximum possible max sum (sum of all elements)
        int result = upperBound;  // Store the smallest valid max sum

        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;  // Try middle value as possible max sum
            
            if (isValidDivision(A, K, mid)) {  // Check if we can divide array into <= K blocks
                result = mid;  // Store the valid max sum
                upperBound = mid - 1;  // Try a smaller sum (left side of search space)
            } else {
                lowerBound = mid + 1;  // Increase the max sum (right side of search space)
            }
        }

        return result;
    }

    // Get the maximum element in the array (smallest possible max sum)
    private int getMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int num : A) {
            max = Math.max(max, num);
        }
        return max;
    }

    // Get the sum of the entire array (largest possible max sum)
    private int getSum(int[] A) {
        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        return sum;
    }

    // Check if the array can be split into at most K blocks with a given max sum
    private boolean isValidDivision(int[] A, int K, int maxSum) {
        int currentSum = 0;
        int requiredBlocks = 1;  // Start with 1 block

        for (int num : A) {
            if (currentSum + num > maxSum) {  // If adding num exceeds maxSum, start a new block
                requiredBlocks++;
                currentSum = num;
                if (requiredBlocks > K) {
                    return false;  // Too many blocks, return false
                }
            } else {
                currentSum += num;  // Continue adding to current block
            }
        }

        return true;  // Valid division found
    }

}
