package org.example;


import static java.util.EnumSet.range;
class Solution {

    public int solution(int N) {
        // Convert N to binary representation
        String binary = Integer.toBinaryString(N);
        System.out.println("Binary representation of N: " + binary);

        // Initialize variables to track the longest binary gap
        int maxGap = 0;
        int currentGap = 0;
        boolean countingZeros = false;

        // Iterate through the binary representation
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);

            // If current character is '1'
            if (c == '1') {
                // Check if we were counting zeros
                if (countingZeros) {
                    // Update maxGap if currentGap is greater
                    maxGap = Math.max(maxGap, currentGap);
                    System.out.println("Max Gap Updated: " + maxGap);
                    // Reset currentGap
                    currentGap = 0;
                } else {
                    // Start counting zeros
                    countingZeros = true;
                }
            } else if (countingZeros) {
                // If current character is '0' and we're counting zeros
                // Increment currentGap
                currentGap++;

//                System.out.println("Current Gap: " + currentGap);
            }
        }

        // Return the longest binary gap
        return maxGap;
    }
}

public class Main {
    public static void main(String[] args) {
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//        for i in range(1, n + 1):
//        2 for j in range(i):
//        3 print ’*’,
//        4 print

//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < n-i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < (2 * i - 1); j++) {
//                    System.out.print("*");
//                }
//
//            System.out.println();

//            for i in range(n, 0, -1):
//            2 for j in range(n - i):
//            3 print ’ ’,
//            4 for j in range(2 * i - 1):
//            5 print ’*’,
//            6 print

//        }

        Solution solution = new Solution();

        int N = 1041;
        int longestBinaryGap = solution.solution(N);
        System.out.println("Longest binary gap for N = " + N + ": " + longestBinaryGap);

        N = 32;
        longestBinaryGap = solution.solution(N);
        System.out.println("Longest binary gap for N = " + N + ": " + longestBinaryGap);


    }

    }
