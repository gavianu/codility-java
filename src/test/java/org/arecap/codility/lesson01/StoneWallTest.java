package org.arecap.codility.lesson01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StoneWallTest {

    @Test
    public void testMinBlocksToBuildWall() {
        StoneWall stoneWall = new StoneWall();

        assertEquals(7, stoneWall.minBlocksToBuildWall(new int[]{8,8,5,7,9,8,7,4,8}));
        assertEquals(1, stoneWall.minBlocksToBuildWall(new int[]{1}));
        assertEquals(3, stoneWall.minBlocksToBuildWall(new int[]{1,2,3}));
        assertEquals(3, stoneWall.minBlocksToBuildWall(new int[]{3,2,1}));
        assertEquals(5, stoneWall.minBlocksToBuildWall(new int[]{1,3,2,1,2,3,1}));
        assertEquals(0, stoneWall.minBlocksToBuildWall(new int[]{}));
    }
}