package com.problem;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Problem #1266 [Medium]
 * Given a list of numbers, create an algorithm that arranges them in order to form the largest possible integer.
 * For example, given [10, 7, 76, 415], you should return 77641510.
 */
public class Problem01266 {

    public static void main(String[] args) {
        int largestPossibleInt = largestPossibleInteger(new int[]{10, 7, 76, 415});
        System.out.println(largestPossibleInt);
    }

    /**
     * Generate Largest Possible Integer
     * Param int [] - int array
     * Return int - Largest possible integer value
     */
    private static int largestPossibleInteger(int[] intValues) {
        // Integer values load in to a String array
        String strNumbers[] = new String[intValues.length];
        for (int i = 0; i < intValues.length; i++) {
            strNumbers[i] = String.valueOf(intValues[i]);
        }

        // Implement a Comparator logics to custom comparison
        Comparator<String> compObj =  new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String str1 = o1.concat(o2);
                String str2 = o2.concat(o1);
                return o2.compareTo(o1);
            }
        };

        // Sort sting values with custom comparison
        Arrays.sort(strNumbers, compObj);

        // Concat sorted integers values to get the Largest Possible Integer
        String largestPossibleInt = "";
        for (int i = 0; i <  strNumbers.length; i++) {
            largestPossibleInt = largestPossibleInt.concat(strNumbers[i]);
        }

        return Integer.parseInt(largestPossibleInt);
    }
}