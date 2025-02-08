package org.arecap.codility.lesson01;

import java.util.Stack;

public class StoneWall {

    public int minBlocksToBuildWall(int[] H) {
        int count = 0;  
        Stack<Integer> stack = new Stack<>();  

        for (int height : H) {
            // Remove all blocks taller than current height
            while (!stack.isEmpty() && stack.peek() > height) {
                stack.pop();
            }
            
            // If the stack is empty or a new height is needed, push it
            if (stack.isEmpty() || stack.peek() < height) {
                stack.push(height);
                count++;  // Count new block
            }
        }

        return count;
    }
    
}
