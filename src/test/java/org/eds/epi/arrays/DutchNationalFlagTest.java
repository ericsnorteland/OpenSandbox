package org.eds.epi.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DutchNationalFlagTest {

    @Test
    public void testOne() {
        int[] ats = {2, 6, 6, 4, 6, 2};
        int[] ans = {2, 2, 4, 6, 6, 6};
        int[] result = DutchNationalFlag.dutchSort(ats, 3);
        assertArrayEquals(ans, result);
    }

    @Test
    public void testTwo() {
        int[] ats = {2, 6, 6, 4};
        int[] ans = {2, 4, 6, 6};
        int[] result = DutchNationalFlag.dutchSort(ats, 3);
        assertArrayEquals(ans, result);
    }
}