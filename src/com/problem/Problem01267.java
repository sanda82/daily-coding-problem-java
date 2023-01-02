package com.problem;

/**
 * Problem #1267 [Hard]
 * Given a list of numbers L, implement a method sum(i, j) which returns the sum from the sublist L[i:j] (including i, excluding j).
 * For example, given L = [1, 2, 3, 4, 5], sum(1, 3) should return sum([2, 3]), which is 5.
 */
public class Problem01267 {

    private static int[] numbers = { 1, 2, 3, 4, 5 };

    public static void main(String[] args) {
        System.out.println(sum(1, 3));
    }

    private static int sum(int i, int j) {
        int sum = 0;
        while (i<j) {
            sum += numbers[i++];
        }
        return sum;
    }

}
