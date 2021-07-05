package org.eds.epi;

import java.util.List;

/**
 * Write a function that takes an Array A of length n and an index i into A and rearranges the elements such that all elements
 * less than A[i] appear first, followed by elements equal to A[i], followed by elements greater than A[i].
 * Your algorithm should have O(1) space complexity and O(n) time complexity.
 *
 * 2, 6, 6, 4
 *
 * 2, 6, 6, 4, 6, 2
 *
 * 2, 2, 6, 4, 6, 6
 *
 *
 *
 *
 */
public class DutchNationalFlag {

    public static int[] dutchSort(int[] arrayToSort, Integer position) {
        // assert not null arrayToSort
        // assert position < arrayToSort.length
        // min position, max position, pivot position

        int minPosition = 0;
        int equalPosition = 0;
        int maxPosition = arrayToSort.length - 1;


        Integer pivot = arrayToSort[position];

        boolean done = false;

        while (equalPosition <= maxPosition) {
            if (arrayToSort[equalPosition] < pivot) {
                Integer temp = arrayToSort[equalPosition];
                arrayToSort[equalPosition] = arrayToSort[minPosition];
                arrayToSort[minPosition] = temp;
                minPosition++;
                equalPosition++;
            } else if (arrayToSort[minPosition] == pivot) {
                equalPosition++;
            } else {
                Integer temp = arrayToSort[equalPosition];
                arrayToSort[equalPosition] = arrayToSort[maxPosition];
                arrayToSort[maxPosition] = temp;
                maxPosition--;
            }
        }

        return arrayToSort;
    }

    public static void main(String[] args) {

    }
}
